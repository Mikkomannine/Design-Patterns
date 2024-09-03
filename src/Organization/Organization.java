package Organization;

import java.io.BufferedWriter;
import java.io.IOException;

abstract class Organization {
    protected String name;

    public Organization(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(Organization organization) {
        throw new UnsupportedOperationException();
    }

    public void remove(Organization organization) {
        throw new UnsupportedOperationException();
    }

    public abstract double getSalary();

    public abstract void print();

    public abstract void printXML(BufferedWriter writer, int indent) throws IOException;
}
