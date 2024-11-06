package Builder;

public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.addComponent(new Component("Intel Core i9-9900K"));
    }

    @Override
    public void buildRAM() {
        computer.addComponent(new Component("Corsair Vengeance LPX 16GB"));
    }

    @Override
    public void buildHardDrive() {
        computer.addComponent(new Component("Samsung 970 EVO Plus 1TB"));
    }

    @Override
    public void buildGraphicsCard() {
        computer.addComponent(new Component("NVIDIA GeForce RTX 2080 Ti"));
    }

    @Override
    public void buildOperatingSystem() {
        computer.addComponent(new Component("Windows 10 Pro"));
    }

    public Computer getComputer() {
        return computer;
    }
}
