package Builder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Gaming Computer:");
        ComputerBuilder computerBuilder = new GamingComputerBuilder();
        ComputerDirector computerDirector = new ComputerDirector(computerBuilder);
        computerDirector.buildComputer();
        Computer computer = computerBuilder.getComputer();
        System.out.println(computer);


        System.out.println("Office Computer:");
        computerBuilder = new OfficeComputerBuilder();
        computerDirector = new ComputerDirector(computerBuilder);
        computerDirector.buildComputer();
        computer = computerBuilder.getComputer();
        System.out.println(computer);

    }
}
