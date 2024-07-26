class Solution {
    int celebrity(int M[][], int n) {
        int start = 0;
        int end = n - 1;
        
        while (start < end) {
            if (M[start][end] == 1) {
                start++;
            } else {
                end--;
            }
        }
        
        int potentialCelebrity = start;
        for (int i = 0; i < n; i++) {
            if (i != potentialCelebrity) {
                if (M[potentialCelebrity][i] == 1 || M[i][potentialCelebrity] == 0) {
                    return -1;
                }
            }
        }
        
        return potentialCelebrity;
    }
}