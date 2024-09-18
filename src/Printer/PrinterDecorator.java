package Printer;

public abstract class PrinterDecorator implements Printer {
    protected Printer decoratedPrinter;

    public PrinterDecorator(Printer decoratedPrinter) {
        this.decoratedPrinter = decoratedPrinter;
    }

    @Override
    public void print(String message) {
        decoratedPrinter.print(message);
    }
}
