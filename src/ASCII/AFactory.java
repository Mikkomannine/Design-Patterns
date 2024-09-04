package ASCII;



class AFactory extends UIFactory {
    @Override
    Button createButton(String text) {
        return new ButtonA(text);
    }

    @Override
    TextField createTextField(String text) {
        return new TextFieldA(text);
    }

    @Override
    Checkbox createCheckbox(String text) {
        return new CheckboxA(text);
    }
}
