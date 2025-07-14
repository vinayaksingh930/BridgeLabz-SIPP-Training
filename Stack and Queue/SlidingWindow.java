import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

class SlidingWindowMaximum {
    // Find maximum in all sliding windows of size k
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }
        
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int resultIndex = 0;
        
        // Deque to store indices of elements in decreasing order of values
        Deque<Integer> deque = new LinkedList<>();
        
        for (int i = 0; i < nums.length; i++) {
            // Remove elements outside the current window
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            
            // Remove smaller elements as they are not needed
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            
            // Add current element index
            deque.offer(i);
            
            // Add maximum to result if we have processed k elements
            if (i >= k - 1) {
                result[resultIndex++] = nums[deque.peek()];
            }
        }
        
        return result;
    }
}

// Test the implementation
class SlidingWindow {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = SlidingWindowMaximum.maxSlidingWindow(nums, k);
        
        System.out.println("Maximum in sliding windows of size " + k + ":");
        System.out.println(Arrays.toString(result)); // Output: [3, 3, 5, 5, 6, 7]
    }
}