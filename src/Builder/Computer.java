package Builder;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private List<Component> components;

    public Computer() {
        this.components = new ArrayList<>();
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Component component : components) {
            sb.append(component.getComponent());
            sb.append("\n");
        }
        return sb.toString();
    }
}
