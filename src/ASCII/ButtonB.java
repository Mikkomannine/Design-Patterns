package ASCII;

class ButtonB extends Button {
    ButtonB(String text) {
        super(text);
    }

    @Override
    void display() {
        System.out.println("<< ButtonB: " + text + " >>");
    }
}