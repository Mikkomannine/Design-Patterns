package ASCII;

class TextFieldA extends TextField {
    TextFieldA(String text) {
        super(text);
    }

    @Override
    void display() {
        System.out.println("[ TextFieldA: " + text + " ]");
    }
}
