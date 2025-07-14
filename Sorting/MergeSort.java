public class MergeSort {
    public static void mergeSortBookPrices(double[] prices, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;
            
            // Sort first and second halves
            mergeSortBookPrices(prices, left, mid);
            mergeSortBookPrices(prices, mid + 1, right);
            
            // Merge the sorted halves
            merge(prices, left, mid, right);
        }
    }
    
    private static void merge(double[] prices, int left, int mid, int right) {
        // Calculate sizes of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        // Create temp arrays
        double[] L = new double[n1];
        double[] R = new double[n2];
        
        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i) {
            L[i] = prices[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = prices[mid + 1 + j];
        }
        
        // Merge the temp arrays
        int i = 0, j = 0;
        int k = left;
        
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                prices[k] = L[i];
                i++;
            } else {
                prices[k] = R[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements of L[] if any
        while (i < n1) {
            prices[k] = L[i];
            i++;
            k++;
        }
        
        // Copy remaining elements of R[] if any
        while (j < n2) {
            prices[k] = R[j];
            j++;
            k++;
        }
    }
    
    public static void main(String[] args) {
        double[] bookPrices = {12.99, 8.99, 15.99, 10.50, 20.00, 7.25};
        
        System.out.println("Original book prices:");
        for (double price : bookPrices) {
            System.out.print(price + " ");
        }
        
        mergeSortBookPrices(bookPrices, 0, bookPrices.length - 1);
        
        System.out.println("\nSorted book prices:");
        for (double price : bookPrices) {
            System.out.print(price + " ");
        }
    }
}