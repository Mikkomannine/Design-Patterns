package ASCII;

abstract class TextField {
    protected String text;

    TextField(String text) {
        this.text = text;
    }

    abstract void display();

    public void setText(String text) {
        this.text = text;
    }
}
