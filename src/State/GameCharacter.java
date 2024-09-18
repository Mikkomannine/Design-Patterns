package State;

public class GameCharacter {
    private String name;
    private int level;
    private int experience;
    private int health;
    private State state;

    public GameCharacter(String name) {
        this.name = name;
        this.level = 1;
        this.experience = 0;
        this.health = 100;
        this.state = new NoviceState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getExperience() {
        return experience;
    }

    public void increaseExperience(int amount) {
        this.experience += amount;
    }

    public void increaseHealth(int amount) {
        this.health += amount;
    }

    public void decreaseHealth(int amount) {
        this.health -= amount;
    }

    public void train() {
        state.train(this);
    }

    public void meditate() {
        state.meditate(this);
    }

    public void fight() {
        state.fight(this);
    }

    public void displayStatus() {
        System.out.println("Name: " + name);
        System.out.println("Level: " + level);
        System.out.println("Experience: " + experience);
        System.out.println("Health: " + health);
        System.out.println("Current State: " + state.getClass().getSimpleName());
    }
}
