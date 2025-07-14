import java.util.HashSet;

class LongestConsecutive {
    // Find length of longest consecutive sequence
    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        
        int maxLength = 0;
        
        for (int num : nums) {
            // Only start counting from the smallest number of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;
                
                // Count consecutive numbers
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }
                
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        
        return maxLength;
    }
}

// Test the implementation
class Consecutive {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = LongestConsecutive.longestConsecutive(nums);
        
        System.out.println("Length of longest consecutive sequence: " + result); // Output: 4
    }
}