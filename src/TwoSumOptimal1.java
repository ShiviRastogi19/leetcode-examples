import java.util.HashMap;
import java.util.Map;

public class TwoSumOptimal1 {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the number and its index
        Map<Integer, Integer> numIndexMap = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (numIndexMap.containsKey(complement)) {
                // Return the indices
                return new int[]{numIndexMap.get(complement), i};
            }

            // Add the current number and its index to the map
            numIndexMap.put(nums[i], i);
        }

        // If no solution is found (this won't happen due to the problem's constraints)
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        // Example usage
        TwoSumOptimal1 solution = new TwoSumOptimal1();
        int[] nums = {2, 12, 11, 7};
        int target = 9;

        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
