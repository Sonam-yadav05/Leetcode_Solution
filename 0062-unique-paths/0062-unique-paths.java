class Solution {
    public int uniquePaths(int m, int n) {
        int N = m + n -2;
        int R = m - 1;
        return nCr(N,R);



        // using Tabulation(DP):--------
        // int[][] dp = new int[m][n];

        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(i==0 || j==0) dp[i][j] = 1;
        //         else{
        //             dp[i][j] = dp[i-1][j] + dp[i][j-1];
        //         }
        //     }
        // }
        // return dp[m-1][n-1];
    
    }

    public int nCr(int n,int r){
        if(r > n) return 0;
        r = Math.min(r,n-r);
        long ans = 1;

        for(int i=0;i<r;i++){
            ans = ans * (n-i) / (i+1);
        }
        return (int)ans;
    }
}