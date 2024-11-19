package Flyweight.maps;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class CityMap implements Map {
    private int width;
    private int height;

    public CityMap(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void render(GraphicsContext gc) {
        gc.setFill(Color.GRAY);
        gc.fillRect(0, 0, width * 32, height * 32);
        // Additional rendering logic for city map
    }
}