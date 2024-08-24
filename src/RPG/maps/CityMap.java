package RPG.maps;

import RPG.tiles.BuildingTile;
import RPG.tiles.ForestTile;
import RPG.tiles.RoadTile;
import RPG.tiles.Tile;

import java.util.Random;

public class CityMap extends Map {

    private static final Tile[] CityTiles = {new BuildingTile(), new RoadTile(), new ForestTile()};

    public CityMap(int width, int height) {
        super(width, height);
    }

    @Override
    protected Tile createTile() {
        Random random = new Random();
        return CityTiles[random.nextInt(CityTiles.length)];
    }

}
