package RPG.tiles;

public class WaterTile implements Tile{

    @Override
    public char getCharacter() {
        return 'W';
    }

    @Override
    public String getType() {
        return "Water";
    }
}
