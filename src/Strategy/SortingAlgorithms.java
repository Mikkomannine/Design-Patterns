package Strategy;

import java.util.Random;
import java.util.Scanner;

public class SortingAlgorithms {
    public static void main(String[] args) {

        int[] smallArray = generateRandomArray(30);
        int[] bigArray = generateRandomArray(100000);

        AlgorithmContext algorithmContext = new AlgorithmContext(new InsertionSort());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a sorting algorithm:");
        System.out.println("1. Insertion Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Bubble Sort");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                algorithmContext.setStrategy(new InsertionSort());
                break;
            case 2:
                algorithmContext.setStrategy(new SelectionSort());
                break;
            case 3:
                algorithmContext.setStrategy(new BubbleSort());
                break;
            default:
                System.out.println("Invalid sorting algorithm. Exiting...");
                return;
        }

        System.out.println("Sorting small array (30 elements):");
        testSortingPerformance(algorithmContext, smallArray);

        System.out.println("Sorting big array (100,000 elements):");
        testSortingPerformance(algorithmContext, bigArray);
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100000); // Random values between 0 and 100,000
        }
        return array;
    }

    private static void testSortingPerformance(AlgorithmContext algorithmContext, int[] array) {
        long startTime = System.currentTimeMillis();
        algorithmContext.sortNumbers(array);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
    }
}
