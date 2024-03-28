import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Generate test instance
        int[] instance = generateInstance(100000); // Adjust size as needed
        int key = instance[2]; // Key to search for

        // Measure runtime for recursive binary search
        long startTimeRecursive = System.nanoTime();
        int indexRecursive = binary.runBinarySearchRecursively(instance, key, 0, instance.length - 1);
        long endTimeRecursive = System.nanoTime();
        long durationRecursive = endTimeRecursive - startTimeRecursive;

        // Measure runtime for iterative binary search
        long startTimeIterative = System.nanoTime();
        int indexIterative = binary.runBinarySearchIteratively(instance, key, 0, instance.length - 1);
        long endTimeIterative = System.nanoTime();
        long durationIterative = endTimeIterative - startTimeIterative;

        // Measure runtime for your binary search
        long startTime = System.nanoTime();
        int index = binary.myBinarysearch(key, instance.length, instance);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        // Output results
        System.out.println("Recursive Binary Search:");
        System.out.println("Index of key: " + indexRecursive);
        System.out.println("Runtime: " + durationRecursive + " nanoseconds");

        System.out.println("\nIterative Binary Search:");
        System.out.println("Index of key: " + indexIterative);
        System.out.println("Runtime: " + durationIterative + " nanoseconds");

        System.out.println("\nMy recursive Binary Search:");
        System.out.println("Index of key: " + index);
        System.out.println("Runtime: " + duration + " nanoseconds");
    }

    public static int[] generateInstance(int size) {
        // Generate test instance (sorted array)
        int[] instance = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            instance[i] = rand.nextInt(10000); // Generating random values (adjust range as needed)
        }
        Arrays.sort(instance); // Sorting the array
        return instance;
    }

}