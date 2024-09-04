package ASCII;
public class Main {
    public static void main(String[] args) {

        UIFactory factoryA = new AFactory();

        Button buttonA = factoryA.createButton("Click Me");
        TextField textFieldA = factoryA.createTextField("TextA");
        Checkbox checkboxA = factoryA.createCheckbox("CheckA");

        buttonA.display();
        textFieldA.display();
        checkboxA.display();

        UIFactory factoryB = new BFactory();

        Button buttonB = factoryB.createButton("Press Me");
        TextField textFieldB = factoryB.createTextField("TextB");
        Checkbox checkboxB = factoryB.createCheckbox("CheckB");

        buttonB.display();
        textFieldB.display();
        checkboxB.display();

        buttonA.setText("New Text");
        buttonA.display();
    }
}

