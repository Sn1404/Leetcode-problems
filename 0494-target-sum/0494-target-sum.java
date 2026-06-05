import java.util.Arrays;

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        // If the target is out of the absolute reachable sum range, it's impossible
        if (Math.abs(target) > sum) {
            return 0;
        }

        // The total range of possible sums goes from -sum to +sum
        int totalColumns = 2 * sum + 1;
        int offset = sum; // Offset to map negative sums to valid array indices

        // dp[i][j] stores the number of ways to form sum (j - offset) using the first i elements
        int[][] dp = new int[n + 1][totalColumns];

        // Base case: 1 way to form a sum of 0 using 0 elements
        dp[0][offset] = 1;

        // Populate the DP table iteratively
        for (int i = 1; i <= n; i++) {
            int currentNum = nums[i - 1];
            for (int j = 0; j < totalColumns; j++) {
                if (dp[i - 1][j] > 0) {
                    // Option 1: Subtract currentNum
                    if (j - currentNum >= 0) {
                        dp[i][j - currentNum] += dp[i - 1][j];
                    }
                    // Option 2: Add currentNum
                    if (j + currentNum < totalColumns) {
                        dp[i][j + currentNum] += dp[i - 1][j];
                    }
                }
            }
        }

        // Return the ways to form the target sum using all n elements
        return dp[n][target + offset];
    }
}
