class Solution {
    static int[] dp;
    public int fib(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return fibonacci(n);
    }

    public int fibonacci(int n){
        if(n <= 1) return n;
        if(dp[n] != -1) return dp[n];
        int ans = fibonacci(n-1) + fibonacci(n-2);
        dp[n] = ans;
        return ans;

    }
}