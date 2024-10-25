package Memento;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> history; // Memento history

    private List<IMemento> redo;

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.history = new ArrayList<>();
        this.redo = new ArrayList<>();
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        model.setOption(optionNumber, choice);
        redo.clear();
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        model.setIsSelected(isSelected);
        redo.clear();
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!history.isEmpty()) {
            System.out.println("Memento found in history");
            IMemento previousState = history.remove(history.size() - 1);
            redo.add(model.createMemento());
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    public void redo() {
        if (!redo.isEmpty()) {
            System.out.println("Memento found in redo");
            IMemento previousState = redo.remove(redo.size() - 1);
            history.add(model.createMemento());
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        history.add(currentState);
    }

    public List<IMemento> getHistory() {
        return history;
    }

    public void restoreState(IMemento memento) {
        saveToHistory();
        model.restoreState(memento);
        gui.updateGui();
    }
}