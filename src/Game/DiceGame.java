package Game;

public class DiceGame extends Game {
    private int[] diceValues;
    private int currentPlayer;
    private int numberOfPlayers;
    private boolean gameEnded;

    @Override
    public void initializeGame(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        diceValues = new int[numberOfPlayers];
        currentPlayer = 0;
        gameEnded = false;
    }

    @Override
    public boolean endOfGame() {
        return gameEnded;
    }

    @Override
    public void playSingleTurn(int player) {
        int roll = (int) (Math.random() * 6) + 1;
        diceValues[player] = roll;
        System.out.println("Player " + player + " rolled " + roll);
        if (roll == 6) {
            gameEnded = true;
        }
    }

    @Override
    public void displayWinner() {
        for (int i = 0; i < numberOfPlayers; i++) {
            if (diceValues[i] == 6) {
                System.out.println("Player " + i + " wins by rolling a 6!");
                return;
            }
        }
    }
}