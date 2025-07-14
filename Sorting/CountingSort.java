public class CountingSort {
    public static void countingSortAges(int[] ages, int min, int max) {
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[ages.length];
        
        // Store count of each age
        for (int age : ages) {
            count[age - min]++;
        }
        
        // Change count[i] so that count[i] now contains actual position of this age in output array
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }
        
        // Build the output array
        for (int i = ages.length - 1; i >= 0; i--) {
            output[count[ages[i] - min] - 1] = ages[i];
            count[ages[i] - min]--;
        }
        
        // Copy the output array to ages[]
        System.arraycopy(output, 0, ages, 0, ages.length);
    }
    
    public static void main(String[] args) {
        int[] studentAges = {14, 16, 12, 18, 15, 13, 17, 11, 10, 15, 14};
        int minAge = 10;  // Minimum age in the dataset
        int maxAge = 18;  // Maximum age in the dataset
        
        System.out.println("Original student ages:");
        for (int age : studentAges) {
            System.out.print(age + " ");
        }
        
        countingSortAges(studentAges, minAge, maxAge);
        
        System.out.println("\nSorted student ages:");
        for (int age : studentAges) {
            System.out.print(age + " ");
        }
    }
}