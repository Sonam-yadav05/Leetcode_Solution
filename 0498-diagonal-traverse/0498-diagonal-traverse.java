class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        boolean dir = true;
        int m=mat.length;
        int n=mat[0].length;
        int row=0,col=0;
        int[] ans = new int[m*n];
        for(int i=0;i<m*n;i++){
            ans[i] = mat[row][col];
            if(dir){
                if(col==n-1){
                    row++;
                    dir=false;
                }
                else if(row==0){
                    col++;
                    dir=false;
                }
                else{
                    col++;
                    row--;
                }
                
            }
            else{
                if(row==m-1){
                    col++;
                    dir=true;
                }
                else if(col==0){
                    row++;
                    dir=true;
                }
                else{
                    row++;
                    col--;
                }
            }

        }
        return ans;
        
    }
}