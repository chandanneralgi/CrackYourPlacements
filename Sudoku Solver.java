class Solution {
    public boolean isSafe(char[][] board, int row, int col, char digit){
        for(int i = 0; i < 9; i++){
            if(board[i][col] == digit){
                return false;
            }
        }
        for(int i = 0; i < 9; i++){
            if(board[row][i] == digit){
                return false;
            }
        }
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for(int i = sr; i < sr+3; i++){
            for(int j = sc; j < sc+3; j++){
                if(board[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean helper(char[][] board, int row, int col){
        if(row == 9){
            return true;
        }
        int currRow = 0;
        int currCol = 0;
        if(col != 8){
            currRow = row;
            currCol = col+1;
        }else{
            currRow = row+1;
            currCol = 0;
        }
        if(board[row][col] != '.'){
            if(helper(board, currRow, currCol)){
                return true;
            }
        }else{
            for(int digit = 1; digit <= 9; digit ++){
                if(isSafe(board, row, col, (char)(digit + '0'))){
                    board[row][col] = (char)(digit + '0');
                    if(helper(board, currRow, currCol)){
                        return true;
                    }
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}