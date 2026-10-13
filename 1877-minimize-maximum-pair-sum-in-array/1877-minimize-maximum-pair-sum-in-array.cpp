class Solution {
public:
    int minPairSum(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int n=nums.size();
        int i=0;
        int j=n-1;
        int MaxSum=0;
        while(i<j){
            int sum =nums[i]+nums[j];
            MaxSum=max(MaxSum,sum);
            i++;
            j--;
        }
        return MaxSum;
        
    }
};