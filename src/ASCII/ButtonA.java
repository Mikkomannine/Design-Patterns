package ASCII;

class ButtonA extends Button {
    ButtonA(String text) {
        super(text);
    }

    @Override
    void display() {
        System.out.println("[ ButtonA: " + text + " ]");
    }
}