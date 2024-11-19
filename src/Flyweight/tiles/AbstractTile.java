package Flyweight.tiles;

import javafx.scene.image.Image;

public abstract class AbstractTile implements Tile {
    protected Image image;

    public AbstractTile(Image image) {
        this.image = image;
    }

    @Override
    public Image getImage() {
        return image;
    }
}