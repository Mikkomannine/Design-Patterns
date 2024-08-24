package RPG.maps;

import RPG.tiles.*;

import java.util.Random;

public class WildernessMap extends Map {


    private static final Tile[] WildernessTiles = {new WaterTile(), new SwampTile(), new ForestTile()};

    public WildernessMap(int width, int height) {
        super(width, height);
    }

    @Override
    protected Tile createTile() {
        Random random = new Random();
        return WildernessTiles[random.nextInt(WildernessTiles.length)];
    }
}
