package State;

public class MasterState implements State {
    @Override
    public void train(GameCharacter character) {
        System.out.println("Masters do not need to train.");
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println("Masters do not need to meditate.");
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println("Masters do not need to fight.");
    }
}