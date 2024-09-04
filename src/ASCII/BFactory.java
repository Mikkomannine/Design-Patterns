package ASCII;



class BFactory extends UIFactory {
    @Override
    Button createButton(String text) {
        return new ButtonB(text);
    }

    @Override
    TextField createTextField(String text) {
        return new TextFieldB(text);
    }

    @Override
    Checkbox createCheckbox(String text) {
        return new CheckboxB(text);
    }
}
