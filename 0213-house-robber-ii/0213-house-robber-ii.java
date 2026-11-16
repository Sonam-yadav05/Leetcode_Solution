class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        if(n==1) return nums[0];
        int f = loot(0,n-2,nums,dp1);
        int l = loot(1,n-1,nums,dp2);
        return Math.max(f,l);
    }

    public int loot(int i,int last,int[] nums,int[] dp){
        if(i > last) return 0;
        if(dp[i] != -1) return dp[i];
        int pick = nums[i] + loot(i+2,last,nums,dp);
        int skip = loot(i+1,last,nums,dp);
        return dp[i] = Math.max(pick,skip);

    }
}