package State;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameCharacter character = new GameCharacter("Hero");

        while (true) {
            character.displayStatus();
            System.out.println("Choose an action: train, meditate, fight, or exit");
            String action = scanner.nextLine();

            switch (action.toLowerCase()) {
                case "train":
                    character.train();
                    break;
                case "meditate":
                    character.meditate();
                    break;
                case "fight":
                    character.fight();
                    break;
                case "exit":
                    System.out.println("Exiting the game.");
                    return;
                default:
                    System.out.println("Invalid action. Please choose again.");
            }
        }
    }
}
