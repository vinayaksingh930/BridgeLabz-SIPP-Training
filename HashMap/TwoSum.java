package HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    // Find indices of two numbers that add up to target
    public static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If complement exists in map, return indices
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            
            // Add current number and its index to map
            map.put(nums[i], i);
        }
        
        // No solution found
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = TwoSum.findTwoSum(nums, target);
        
        System.out.println("Indices of two numbers that add up to " + target + ": " + 
                          Arrays.toString(result)); // Output: [0, 1]
    }
}