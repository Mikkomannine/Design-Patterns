package State;

public class ExpertState implements State {
    @Override
    public void train(GameCharacter character) {
        character.increaseExperience(30);
        System.out.println("Training... Experience increased by 30.");
        if (character.getExperience() >= 200) {
            character.setState(new MasterState());
            System.out.println("Congratulations! You have advanced to Master level.");
        }
    }

    @Override
    public void meditate(GameCharacter character) {
        character.increaseHealth(20);
        System.out.println("Meditating... Health increased by 20.");
    }

    @Override
    public void fight(GameCharacter character) {
        character.decreaseHealth(15);
        character.increaseExperience(40);
        System.out.println("Fighting... Health decreased by 15, Experience increased by 40.");
    }
}