import java.util.HashMap;

class PairSum {
    // Find if there is a pair with given sum
    public static boolean hasPairWithSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            // If target - nums[i] is already in map, pair is found
            if (map.containsKey(target - nums[i])) {
                return true;
            }
            
            // Store current element and its index
            map.put(nums[i], i);
        }
        
        return false;
    }
}

// Test the implementation
class Pair {
    public static void main(String[] args) {
        int[] nums = {10, 15, 3, 7};
        int target = 17;
        
        boolean result = PairSum.hasPairWithSum(nums, target);
        System.out.println("Does array have a pair with sum " + target + "? " + result); // Output: true
    }
}