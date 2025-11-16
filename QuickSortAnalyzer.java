import java.util.Random;

public class QuickSortAnalyzer {
    
    // Quick Sort implementation
    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }
    
    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }
    
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                // Swap elements
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        
        // Swap pivot to correct position
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        
        return i + 1;
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
        
        System.out.println("| Algorithm: | Quick Sort |");
        System.out.println("|------------|------------|");
        System.out.println("| Input Size | Time (ms)  |");
        System.out.println("|------------|------------|");
        
        for (int size : inputSizes) {
            // Generate random array
            int[] array = generateRandomArray(size);
            
            // Measure sorting time
            long startTime = System.nanoTime();
            quickSort(array);
            long endTime = System.nanoTime();
            
            double duration = (endTime - startTime) / 1_000_000.0;
            System.out.printf("| %-10d | %-10.4f |\n", size, duration);
        }
    }
}