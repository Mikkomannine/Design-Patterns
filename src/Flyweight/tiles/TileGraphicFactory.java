package Flyweight.tiles;


import javafx.scene.image.Image;

import java.util.HashMap;
import java.util.Map;

public class TileGraphicFactory {
    private static final Map<String, Image> tileGraphics = new HashMap<>();

    public static Image getTileGraphic(String tileType) {
        if (!tileGraphics.containsKey(tileType)) {
            tileGraphics.put(tileType, loadTileGraphic(tileType));
        }
        return tileGraphics.get(tileType);
    }

    private static Image loadTileGraphic(String tileType) {
        switch (tileType.toLowerCase()) {
            case "swamp":
                return new Image("images/wetland.png");
            case "water":
                return new Image("images/lake.png");
            case "road":
                return new Image("images/road.png");
            case "forest":
                return new Image("images/trees.png");
            case "building":
                return new Image("images/architecture-and-city.png");
            default:
                throw new IllegalArgumentException("Unknown tile type: " + tileType);
        }
    }
}
