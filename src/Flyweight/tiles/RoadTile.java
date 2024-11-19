package Flyweight.tiles;

import RPG.tiles.Tile;
import javafx.scene.image.Image;

public class RoadTile extends AbstractTile {
    public RoadTile(Image image) {
        super(image);
    }

    @Override
    public char getCharacter() {
        return 'R';
    }

    @Override
    public String getType() {
        return "Road";
    }

    @Override
    public Image getImage() {
        return image;
    }
}