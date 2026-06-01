class Solution {
    public int maxSubArray(int[] nums) {
        int maxi =Integer.MIN_VALUE;
        int n =nums.length;
        int curr_sum = 0;
        for(int i=0; i<n;i++){
            curr_sum +=nums[i]; 
                maxi =Math.max(maxi, curr_sum);
                curr_sum =curr_sum<0?0:curr_sum;

            }
        
            return maxi; 
    } 
    }
