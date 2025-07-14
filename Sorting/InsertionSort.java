public class InsertionSort {
    public static void insertionSortEmployeeIds(int[] ids) {
        int n = ids.length;
        
        for (int i = 1; i < n; i++) {
            int key = ids[i];  // Current element to be inserted in sorted part
            int j = i - 1;
            
            // Move elements greater than key to one position ahead
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j = j - 1;
            }
            
            // Place key at its correct position in sorted array
            ids[j + 1] = key;
        }
    }
    
    public static void main(String[] args) {
        int[] employeeIds = {1024, 7814, 2508, 9818, 4562};
        
        System.out.println("Original employee IDs:");
        for (int id : employeeIds) {
            System.out.print(id + " ");
        }
        
        insertionSortEmployeeIds(employeeIds);
        
        System.out.println("\nSorted employee IDs:");
        for (int id : employeeIds) {
            System.out.print(id + " ");
        }
    }
}