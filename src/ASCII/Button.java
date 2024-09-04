package ASCII;

abstract class Button {
    protected String text;

    Button(String text) {
        this.text = text;
    }

    abstract void display();

    public void setText(String text) {
        this.text = text;
    }
}
