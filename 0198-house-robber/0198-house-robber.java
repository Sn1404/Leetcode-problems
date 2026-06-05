class Solution {
    private int f(int [] nums, int ind, int [] dp){
        if(ind >= nums.length) return 0;
        if(dp[ind] != -1) return dp[ind];
        // not take
        int nt = f(nums, ind+1, dp);
        // take
        int t = f(nums, ind+2, dp) + nums[ind];
        return dp[ind] = Math.max(nt, t);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int [] dp = new int[n+2]; 
        Arrays.fill(dp, -1);
        dp[n] = 0; dp[n+1] = 0;
        for(int i = n-1; i>=0; i--){
            // not take
            int nt = dp[(i+1)];
            // take
            int t = dp[(i+2)] + nums[i];
            dp[i] = Math.max(nt, t);
        }
        return dp[0];
    }
}