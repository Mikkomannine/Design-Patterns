package ASCII;

abstract class Checkbox {
    protected String text;

    Checkbox(String text) {
        this.text = text;
    }

    abstract void display();

    public void setText(String text) {
        this.text = text;
    }
}