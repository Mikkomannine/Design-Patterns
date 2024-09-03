package Organization;

import java.io.BufferedWriter;
import java.io.IOException;

class Employee extends Organization {
    private double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("Employee: " + getName() + ", Salary: " + getSalary());
    }

    @Override
    public void printXML(BufferedWriter writer, int indent) throws IOException {
        writeIndent(writer, indent);
        writer.write("<Employee name=\"" + getName() + "\" salary=\"" + getSalary() + "\" />\n");
    }

    private void writeIndent(BufferedWriter writer, int indent) throws IOException {
        for (int i = 0; i < indent; i++) {
            writer.write("  ");
        }
    }
}
