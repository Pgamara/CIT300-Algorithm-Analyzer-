import java.util.Arrays;
import java.util.Random;

public class BinarySearchAnalyzer {
    
    // Binary Search implementation (requires sorted array)
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
    // Generate random array of given size
    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10000);
        }
        return array;
    }
    
    public static void main(String[] args) {
        int[] inputSizes = {100, 500, 1000};
        
        System.out.println("| Algorithm: | Binary Search |");
        System.out.println("|------------|---------------|");
        System.out.println("| Input Size | Time (ms)     |");
        System.out.println("|------------|---------------|");
        
        for (int size : inputSizes) {
            // Generate and sort array first
            int[] array = generateRandomArray(size);
            Arrays.sort(array);
            
            // Target that exists in array
            Random random = new Random();
            int target = array[random.nextInt(size)];
            
            // Measure binary search time
            long startTime = System.nanoTime();
            int result = binarySearch(array, target);
            long endTime = System.nanoTime();
            
            double duration = (endTime - startTime) / 1_000_000.0;
            System.out.printf("| %-10d | %-13.4f |\n", size, duration);
        }
    }
}