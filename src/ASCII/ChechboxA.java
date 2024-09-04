package ASCII;


class CheckboxA extends Checkbox {
    CheckboxA(String text) {
        super(text);
    }

    @Override
    void display() {
        System.out.println("[CheckboxA: " + text + "] [ ]");
    }
}