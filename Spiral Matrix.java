class Solution {
    public static ArrayList<Integer> spiralOrder(int[][] matrix) {
        int sr = 0;
        int sc = 0;
        int er = matrix.length-1;
        int ec = matrix[0].length-1;
        ArrayList<Integer> list = new ArrayList<>();
        while(sr <= er && sc <= ec){
            for(int i=sc; i<=ec; i++){
                list.add(matrix[sr][i]);
            }
            for(int i=sr+1; i<=er; i++){
                list.add(matrix[i][ec]);
            }
            for(int i=ec-1; i>=sc; i--){
                if(sr == er){
                    break;
                }
                list.add(matrix[er][i]);
            }
            for(int i=er-1; i>sr; i--){
                if(sc == ec){
                    break;
                }
                list.add(matrix[i][sc]);
            }
            sr++;
            er--;
            sc++;
            ec--;
        }
        return list;
    }
}