package Flyweight.tiles;

import javafx.scene.image.Image;

public class WaterTile extends AbstractTile {
    public WaterTile(Image image) {
        super(image);
    }

    @Override
    public char getCharacter() {
        return 'W';
    }

    @Override
    public String getType() {
        return "water";
    }

    @Override
    public Image getImage() {
        return image;
    }
}
