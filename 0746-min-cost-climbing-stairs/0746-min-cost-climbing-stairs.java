class Solution {
    static int[] dp;

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        dp = new int[n];
        Arrays.fill(dp,-1);
        climb(0,cost);
        return Math.min(dp[0],dp[1]);
    }

    public int climb(int i,int[] cost){
        if(i >= cost.length) return 0;
        if(dp[i] != -1) return dp[i];
        return dp[i] = cost[i] + Math.min(climb(i+1,cost),climb(i+2,cost));

    }
}