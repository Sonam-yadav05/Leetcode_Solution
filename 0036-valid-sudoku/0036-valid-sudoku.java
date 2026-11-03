class Solution {
    public boolean isValidSudoku(char[][] board) {
       return (validRow(board) && validCol(board)) && validCube(board); 
    }
    public boolean validRow(char[][] board){
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<m;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<n;j++){
                char ch = board[i][j];
                if(ch != '.'){
                    if(!set.add(ch)) return false;
                }
            }
        }
        return true;
    }

    public boolean validCol(char[][] board){
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<m;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<n;j++){
                char ch = board[j][i];
                if(ch != '.'){
                    if(!set.add(ch)) return false;
                }
            }
        }
        return true;
    }

    public boolean validCube(char[][] board){
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<m;i += 3){
            for(int j=0;j<n;j += 3){
                boolean valid = helper(board,i,j);
                if(!valid) return false;
            }
        }
        return true;
    }

    public boolean helper(char[][] board,int row,int col){;
        HashSet<Character> set = new HashSet<>();
        for(int i=row;i<row+3;i++){    
            for(int j=col;j<col+3;j++){
                char ch = board[i][j];
                if(ch != '.'){
                    if(!set.add(ch)) return false;
                }
            }
        }
        return true;
    }
}