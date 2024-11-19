package Flyweight.tiles;

import RPG.tiles.Tile;
import javafx.scene.image.Image;

public class ForestTile extends AbstractTile {
    public ForestTile(Image image) {
        super(image);
    }

    @Override
    public char getCharacter() {
        return 'F';
    }

    @Override
    public String getType() {
        return "forest";
    }

    @Override
    public Image getImage() {
        return image;
    }
}