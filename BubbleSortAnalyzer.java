import java.util.Random;

public class BubbleSortAnalyzer {
    
    // Bubble Sort implementation
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
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
        
        System.out.println("| Algorithm: | Bubble Sort |");
        System.out.println("|------------|-------------|");
        System.out.println("| Input Size | Time (ms)   |");
        System.out.println("|------------|-------------|");
        
        for (int size : inputSizes) {
            // Generate random array
            int[] array = generateRandomArray(size);
            
            // Measure sorting time
            long startTime = System.nanoTime();
            bubbleSort(array);
            long endTime = System.nanoTime();
            
            double duration = (endTime - startTime) / 1_000_000.0;
            System.out.printf("| %-10d | %-11.4f |\n", size, duration);
        }
    }
}