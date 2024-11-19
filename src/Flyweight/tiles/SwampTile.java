package Flyweight.tiles;

import javafx.scene.image.Image;


public class SwampTile extends AbstractTile {
    public SwampTile(Image image) {
        super(image);
    }

    @Override
    public char getCharacter() {
        return 'S';
    }

    @Override
    public String getType() {
        return "swamp";
    }

    @Override
    public Image getImage() {
        return image;
    }
}