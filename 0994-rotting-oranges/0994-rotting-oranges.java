class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int n = grid.length;
        int m = grid[0].length;
        int freshCnt = 0;
        Queue<int[]> q = new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2) q.offer(new int[]{i,j});
                else if(grid[i][j]== 1) freshCnt++;
                else continue;
            }
        }

        if(freshCnt == 0) return 0;
        int count =0;
        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
        while(q.size()!=0){
            ++count;
            int size = q.size();
            for(int i=0;i<size;i++){

                int[] point = q.poll();
                for(int[] row : dir){
                    int x = point[0] + row[0];
                    int y = point[1] + row[1];

                    if(x<0 || y<0 || x>=n || y >=m || grid[x][y]==2 || grid[x][y] == 0) continue;
                    q.offer(new int[]{x,y});
                    grid[x][y] = 2;
                    freshCnt--;
                }
            }
        }
        return (freshCnt == 0)? count-1:-1;

    }
}