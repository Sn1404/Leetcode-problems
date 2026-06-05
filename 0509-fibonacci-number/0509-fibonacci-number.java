class Solution {
   /* public int f(int n, int [] dp ){
        if(n<2) return n;
        if(dp[n]!=0) return dp[n];
        return dp[n] = f(n-1, dp)+f(n-2, dp);

    }
*/
    public int fib(int n){
        int dp[] = new int[n+1];
        if(n<2 ) return n;
        dp[0]= 0; dp[1] = 1;
        for(int i =2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}

