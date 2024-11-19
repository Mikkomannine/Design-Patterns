package Flyweight.tiles;

import RPG.tiles.Tile;
import javafx.scene.image.Image;

public class BuildingTile extends AbstractTile {
    public BuildingTile(Image image) {
        super(image);
    }

    @Override
    public char getCharacter() {
        return 'B';
    }

    @Override
    public String getType() {
        return "Building";
    }

    @Override
    public Image getImage() {
        return image;
    }
}