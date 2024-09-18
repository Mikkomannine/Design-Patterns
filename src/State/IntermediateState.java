package State;

public class IntermediateState implements State {
    @Override
    public void train(GameCharacter character) {
        character.increaseExperience(20);
        System.out.println("Training... Experience increased by 20.");
        if (character.getExperience() >= 100) {
            character.setState(new ExpertState());
            System.out.println("Congratulations! You have advanced to Expert level.");
        }
    }

    @Override
    public void meditate(GameCharacter character) {
        character.increaseHealth(10);
        System.out.println("Meditating... Health increased by 10.");
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println("Intermediates cannot fight.");
    }
}
