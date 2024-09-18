package State;

public class NoviceState implements State {
    @Override
    public void train(GameCharacter character) {
        character.increaseExperience(10);
        System.out.println("Training... Experience increased by 10.");
        if (character.getExperience() >= 50) {
            character.setState(new IntermediateState());
            System.out.println("Congratulations! You have advanced to Intermediate level.");
        }
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println("Novices cannot meditate.");
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println("Novices cannot fight.");
    }
}
