package Organization;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("John Doe", 50000);
        Employee emp2 = new Employee("Jane Smith", 60000);

        Department dep1 = new Department("Department1");
        Department dep2 = new Department("Department2");
        Department headOffice = new Department("HQ");

        dep1.add(emp1);
        dep2.add(emp2);

        headOffice.add(dep1);
        headOffice.add(dep2);

        System.out.println("Total Salary of the Organization: " + headOffice.getSalary());
        System.out.println("\nOrganization Structure:");
        headOffice.print();

        //XML
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("organization_structure.xml"))) {
            headOffice.printXML(writer, 0);
            System.out.println("\nOrganization structure written to organization_structure.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}