public class QuickSort {
    public static void quickSortProductPrices(double[] prices, int low, int high) {
        if (low < high) {
            // Find partition index (pivot position after partition)
            int pi = partition(prices, low, high);
            
            // Recursively sort elements before and after partition
            quickSortProductPrices(prices, low, pi - 1);
            quickSortProductPrices(prices, pi + 1, high);
        }
    }
    
    private static int partition(double[] prices, int low, int high) {
        // Choose the rightmost element as pivot
        double pivot = prices[high];
        
        // Index of smaller element
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (prices[j] <= pivot) {
                i++;
                
                // Swap prices[i] and prices[j]
                double temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }
        
        // Swap prices[i+1] and prices[high] (put pivot in its correct position)
        double temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;
        
        return i + 1;
    }
    
    public static void main(String[] args) {
        double[] productPrices = {45.99, 19.99, 29.99, 15.99, 39.99, 4.99};
        
        System.out.println("Original product prices:");
        for (double price : productPrices) {
            System.out.print(price + " ");
        }
        
        quickSortProductPrices(productPrices, 0, productPrices.length - 1);
        
        System.out.println("\nSorted product prices:");
        for (double price : productPrices) {
            System.out.print(price + " ");
        }
    }
}