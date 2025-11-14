import java.util.Arrays;
import java.util.Random;

public class LinearSearchAnalyzer {
    
    // Linear Search implementation
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }
    
    // Generate random array of given size
    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10000); // Random numbers between 0-9999
        }
        return array;
    }
    
    public static void main(String[] args) {
        // Input sizes to test
        int[] inputSizes = {100, 500, 1000};
        
        System.out.println("| Algorithm: | Linear Search |");
        System.out.println("|------------|---------------|");
        System.out.println("| Input Size | Time (ms)     |");
        System.out.println("|------------|---------------|");
        
        // Test for each input size
        for (int size : inputSizes) {
            // Generate random array
            int[] array = generateRandomArray(size);
            
            // Generate a target value that exists in the array
            Random random = new Random();
            int target = array[random.nextInt(size)];
            
            // Measure execution time
            long startTime = System.nanoTime();
            int result = linearSearch(array, target);
            long endTime = System.nanoTime();
            
            // Convert to milliseconds
            double duration = (endTime - startTime) / 1_000_000.0;
            
            // Display results in table format
            System.out.printf("| %-10d | %-13.4f |\n", size, duration);
        }
    }
}