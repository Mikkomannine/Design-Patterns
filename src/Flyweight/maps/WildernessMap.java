package Flyweight.maps;

import Flyweight.tiles.*;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.Random;

public class WildernessMap implements Map {
    private static final String[] WildernessTileTypes = {"water", "swamp", "forest"};
    private int width;
    private int height;

    public WildernessMap(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void render(GraphicsContext gc) {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Tile tile = createTile();
                gc.drawImage(tile.getImage(), x * 32, y * 32);
            }
        }
    }

    protected Tile createTile() {
        Random random = new Random();
        String tileType = WildernessTileTypes[random.nextInt(WildernessTileTypes.length)];
        return createTileByType(tileType);
    }

    private Tile createTileByType(String tileType) {
        Image image = TileGraphicFactory.getTileGraphic(tileType);
        switch (tileType) {
            case "water":
                return new WaterTile(image);
            case "swamp":
                return new SwampTile(image);
            case "forest":
                return new ForestTile(image);
            default:
                throw new IllegalArgumentException("Unknown tile type: " + tileType);
        }
    }
}