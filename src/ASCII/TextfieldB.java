package ASCII;

class TextFieldB extends TextField {
    TextFieldB(String text) {
        super(text);
    }

    @Override
    void display() {
        System.out.println("<< TextFieldB: " + text + " >>");
    }
}
