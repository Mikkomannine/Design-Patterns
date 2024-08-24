package RPG.maps;

import RPG.tiles.Tile;

public abstract class Map {

    protected Tile[][] tiles;
    protected int width;
    protected int height;

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        tiles = new Tile[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                tiles[i][j] = createTile();
            }
        }
    }

    protected abstract Tile createTile();

    public void display() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(tiles[i][j].getCharacter() + " ");
            }
            System.out.println();
        }
    }

}
