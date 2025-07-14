
public class SearchComparison {
    // Linear Search: O(N)
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Target not found
    }

    // Binary Search: O(log N)
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] dataset = new int[1_000_000];
        for (int i = 0; i < dataset.length; i++) {
            dataset[i] = i; // Populate dataset with sorted values
        }

        int target = 999_999;

        // Linear Search
        long startTime = System.nanoTime();
        int linearResult = linearSearch(dataset, target);
        long endTime = System.nanoTime();
        System.out.println("Linear Search Result: " + linearResult + ", Time: " + (endTime - startTime) / 1_000_000.0 + " ms");

        // Binary Search
        startTime = System.nanoTime();
        int binaryResult = binarySearch(dataset, target);
        endTime = System.nanoTime();
        System.out.println("Binary Search Result: " + binaryResult + ", Time: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
}