public class HeapSort {
    public static void heapSortSalaries(int[] salaries) {
        int n = salaries.length;
        
        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }
        
        // One by one extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;
            
            // Call heapify on the reduced heap
            heapify(salaries, i, 0);
        }
    }
    
    // Heapify a subtree rooted with node i which is an index in salaries[]
    private static void heapify(int[] salaries, int n, int i) {
        int largest = i;  // Initialize largest as root
        int left = 2 * i + 1;  // left child
        int right = 2 * i + 2;  // right child
        
        // If left child is larger than root
        if (left < n && salaries[left] > salaries[largest]) {
            largest = left;
        }
        
        // If right child is larger than largest so far
        if (right < n && salaries[right] > salaries[largest]) {
            largest = right;
        }
        
        // If largest is not root
        if (largest != i) {
            int swap = salaries[i];
            salaries[i] = salaries[largest];
            salaries[largest] = swap;
            
            // Recursively heapify the affected sub-tree
            heapify(salaries, n, largest);
        }
    }
    
    public static void main(String[] args) {
        int[] expectedSalaries = {75000, 60000, 85000, 90000, 65000, 95000};
        
        System.out.println("Original expected salaries:");
        for (int salary : expectedSalaries) {
            System.out.print(salary + " ");
        }
        
        heapSortSalaries(expectedSalaries);
        
        System.out.println("\nSorted expected salaries:");
        for (int salary : expectedSalaries) {
            System.out.print(salary + " ");
        }
    }
}