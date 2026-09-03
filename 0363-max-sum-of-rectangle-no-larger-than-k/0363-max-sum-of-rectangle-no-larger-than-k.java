class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int m=matrix.length;
        int n=matrix[0].length;
     
        for(int i=0;i<m;i++){
            for(int j=0;j<n-1;j++){
                matrix[i][j+1]=matrix[i][j+1]+matrix[i][j];
            }
        }
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=matrix[i-1][j] + matrix[i][j];
            }
        }
        int ans = Integer.MIN_VALUE;
        for (int r1 = 0; r1 < m; r1++) {
            for (int c1 = 0; c1 < n; c1++) {

                for (int r2 = r1; r2 < m; r2++) {
                    for (int c2 = c1; c2 < n; c2++) {

                        int sum = matrix[r2][c2];

                        if (r1 > 0) {
                            sum -= matrix[r1 - 1][c2];
                        }

                        if (c1 > 0) {
                            sum -= matrix[r2][c1 - 1];
                        }

                        if (r1 > 0 && c1 > 0) {
                            sum += matrix[r1 - 1][c1 - 1];
                        }

                        if (sum <= k) {
                            ans = Math.max(ans, sum);
                        }
                    }
                }
            }
        }
        return ans;


        
    }
}