class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoard = new ArrayList<>();
        char board[][] = new char[n][n];
        for(int i = 0; i < n; i++){
            Arrays.fill(board[i], 'X');
        }
        nQueens(board, allBoard, 0);
        return allBoard;
    }
    public void nQueens(char board[][], List<List<String>> allBoard, int row){
        if(row == board.length){
            saveBoard(board, allBoard);
            return;
        }
        for(int i = 0; i < board.length; i++){
            if(isSafe(board, row, i)){
                board[row][i] = 'Q';
                nQueens(board, allBoard, row+1);
                board[row][i] = 'X';
            }
        }
    }
    public boolean isSafe(char board[][], int row, int col){
        for(int i = row - 1; i >= 0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public void saveBoard(char board[][], List<List<String>> allBoard){
        List<String> newBoard = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            String row = "";
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 'Q'){
                    row += 'Q';
                }else{
                    row += '.';
                }
            }
            newBoard.add(row);
        }
        allBoard.add(newBoard);
    }
}