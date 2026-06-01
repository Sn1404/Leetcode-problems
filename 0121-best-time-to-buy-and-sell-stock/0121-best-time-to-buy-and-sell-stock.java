class Solution {
    public int maxProfit(int[] prices) {
        int msf = prices[0];
        int n=  prices.length;
        int ans =0;
        for(int i=1;i<n;i++){
            ans =Math.max(prices[i]-msf, ans);
            msf = Math.min(msf, prices[i]);
        }   
        return ans;
    }
}