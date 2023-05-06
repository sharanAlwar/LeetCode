class Solution {
    public int climbStairs(int n) {
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        return test(0,n,dp);
    }

    public int test(int k,int n,int[]dp){
        if(k==n) return 1;
        if(k>n) return 0;
        if(dp[k]!=-1) return dp[k];
        return dp[k]=test(k+1,n,dp)+test(k+2,n,dp);
    }
}
