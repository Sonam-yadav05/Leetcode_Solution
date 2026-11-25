class Solution {
    public long minCost(int[] nums) {
        int n = nums.length;
        long INF = Long.MAX_VALUE/4;
        long dp = 0;
        long dp1 = INF;
        long dp2 = INF;

        for(int i=0;i<n;i++){
            long x = nums[i];

            long ndp = INF;
            long ndp1 = INF;
            long ndp2 = INF;

            ndp1 = Math.min(ndp1,dp +x);

            ndp1 = Math.min(ndp1,dp1);
            ndp2 = Math.min(ndp2,dp2);

            ndp2 = Math.min(ndp2,dp1+x);
            ndp1 = Math.min(ndp1,dp2+x);

            ndp = Math.min(ndp,dp1+x);

            dp = ndp;
            dp1 = ndp1;
            dp2 = ndp2;

            
        }
        return dp;
        
    }
}