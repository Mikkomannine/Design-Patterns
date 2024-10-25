package Memento;

import java.time.LocalDateTime;

public class Memento implements IMemento {
    private int[] options;
    private boolean isSelected;

    private LocalDateTime timestamp;

    public Memento(int[] options, boolean isSelected) {
        this.options = options.clone();
        this.isSelected = isSelected;
        this.timestamp = LocalDateTime.now();
        System.out.println("Memento created");
    }


    public int[] getOptions() {
        return options.clone();
    }

    public boolean isSelected() {
        return isSelected;
    }

    @Override
    public String getMetadata() {
        return "Memento created at " + timestamp;
    }
}
