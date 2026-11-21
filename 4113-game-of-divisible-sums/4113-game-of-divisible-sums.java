class Solution {
    public long maxDifference(int[] nums) {
        int n = nums.length;
        int[] clone = nums.clone();
        long[] dp = new long[n+2];

        for(int i = n-1;i>=0;i--){
            long sum = nums[i];
            dp[i] = (sum % 3  == 0) ? sum - dp[i+1] : sum + dp[i+1];

            if(i+1 <n){
                sum += nums[i+1];
                long val = (sum % 3 == 0)? sum  - dp[i+2] : sum+ dp[i+2];

                dp[i] = Math.max(dp[i],val);
            }
        }
        return dp[0];
    }
}