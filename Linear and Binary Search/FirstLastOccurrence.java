public class FirstLastOccurrence {
    public static int[] findFirstAndLast(int[] arr, int target) {
        int first = findOccurrence(arr, target, true);
        int last = findOccurrence(arr, target, false);
        return new int[]{first, last};
    }

    private static int findOccurrence(int[] arr, int target, boolean findFirst) {
        int left = 0, right = arr.length - 1, result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                if (findFirst) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        int[] result = findFirstAndLast(arr, target);
        System.out.println("First Occurrence: " + result[0] + ", Last Occurrence: " + result[1]); // Output: 1, 3
    }
}