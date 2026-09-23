class Solution {
    public int minDays(int n) {
        int d = n;
        int[] dp = new int[n+1];
        Arrays.fill(dp,n+1);
        dp[0]=0;
        for(int i=1;i<=n;i++){
            int sum = 0;
            for(int j=1;sum + j <= i;j++){
                sum +=j;
                int days = j;
                int left = i-sum;

                if(left > 0){
                    days += 1 + dp[left];
                }
                dp[i]=Math.min(dp[i],days);
            }
        }
        return dp[n];
        
    }
}