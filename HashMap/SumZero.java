import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class ZeroSumSubarray {
    // Find all subarrays with zero sum
    public static List<int[]> findZeroSumSubarrays(int[] nums) {
        List<int[]> result = new ArrayList<>();
        HashMap<Integer, List<Integer>> sumMap = new HashMap<>();
        
        // Initialize with 0 sum at index -1
        List<Integer> indices = new ArrayList<>();
        indices.add(-1);
        sumMap.put(0, indices);
        
        int sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            
            // If this sum has been seen before, there is a zero-sum subarray
            if (sumMap.containsKey(sum)) {
                List<Integer> previousIndices = sumMap.get(sum);
                for (int prevIdx : previousIndices) {
                    // Subarray from prevIdx+1 to i has zero sum
                    result.add(new int[] {prevIdx + 1, i});
                }
            }
            
            // Add current index to the list of indices for this sum
            if (!sumMap.containsKey(sum)) {
                sumMap.put(sum, new ArrayList<>());
            }
            sumMap.get(sum).add(i);
        }
        
        return result;
    }
}

// Test the implementation
class SumZero {
    public static void main(String[] args) {
        int[] nums = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        List<int[]> zeroSumSubarrays = ZeroSumSubarray.findZeroSumSubarrays(nums);
        
        System.out.println("Zero Sum Subarrays:");
        for (int[] subarray : zeroSumSubarrays) {
            System.out.println("Start: " + subarray[0] + ", End: " + subarray[1]);
        }
    }
}