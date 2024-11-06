package Builder;

public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.addComponent(new Component("Intel Core i5"));
    }

    @Override
    public void buildRAM() {
        computer.addComponent(new Component("8GB DDR4"));
    }

    @Override
    public void buildHardDrive() {
        computer.addComponent(new Component("1TB HDD"));
    }

    @Override
    public void buildGraphicsCard() {
        computer.addComponent(new Component("Integrated Graphics"));
    }

    @Override
    public void buildOperatingSystem() {
        computer.addComponent(new Component("Windows 10"));
    }

    public Computer getComputer() {
        return computer;
    }
}
