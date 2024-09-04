package ASCII;


class CheckboxB extends Checkbox {
    CheckboxB(String text) {
        super(text);
    }

    @Override
    void display() {
        System.out.println("<<CheckboxB: " + text + ">> [ ]");
    }
}
