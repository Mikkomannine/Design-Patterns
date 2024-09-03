package Organization;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


class Department extends Organization {
    private List<Organization> components = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public void add(Organization component) {
        components.add(component);
    }

    @Override
    public void remove(Organization component) {
        components.remove(component);
    }

    @Override
    public double getSalary() {
        double totalSalary = 0;
        for (Organization component : components) {
            totalSalary += component.getSalary();
        }
        return totalSalary;
    }

    @Override
    public void print() {
        System.out.println("Department: " + getName());
        for (Organization component : components) {
            component.print();
        }
    }

    @Override
    public void printXML(BufferedWriter writer, int indent) throws IOException {
        writeIndent(writer, indent);
        writer.write("<Department name=\"" + getName() + "\">\n");
        for (Organization component : components) {
            component.printXML(writer, indent + 1);
        }
        writeIndent(writer, indent);
        writer.write("</Department>\n");
    }

    private void writeIndent(BufferedWriter writer, int indent) throws IOException {
        for (int i = 0; i < indent; i++) {
            writer.write("  ");
        }
    }
}