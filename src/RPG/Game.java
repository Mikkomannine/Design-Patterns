package RPG;

import RPG.maps.CityMap;
import RPG.maps.Map;
import RPG.maps.WildernessMap;


public class Game {

    public static void main(String[] args) {
        Game game = new Game();

        // CityMap
        Map cityMap = game.createMap("City", 5, 5);
        System.out.println("City Map:");
        cityMap.display();

        // WildernessMap
        Map wildernessMap = game.createMap("Wilderness", 5, 5);
        System.out.println("Wilderness Map:");
        wildernessMap.display();
    }

    // Factory Method
    public Map createMap(String type, int width, int height) {
        switch (type.toLowerCase()) {
            case "city":
                return new CityMap(width, height);
            case "wilderness":
                return new WildernessMap(width, height);
            default:
                throw new IllegalArgumentException("Unknown map type: " + type);
        }
    }
}

