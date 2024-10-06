package Strategy;

public class AlgorithmContext {

    private AlgorithmStrategy sortStrategy;

    public AlgorithmContext(AlgorithmStrategy strategy) {
        this.sortStrategy = strategy;
    }

    public void sortNumbers(int[] data) {
        sortStrategy.sort(data);
    }

    public void setStrategy(AlgorithmStrategy strategy) {
        this.sortStrategy = strategy;
    }
}
