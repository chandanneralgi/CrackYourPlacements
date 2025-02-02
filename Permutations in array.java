class Solution {
    public boolean isPossible(long a[], long b[], int n, long k) {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0; i < n/2; i++){
            long temp = b[i];
            b[i] = b[n - i - 1];
            b[n - i - 1] = temp;
        }
        for(int i = 0; i < n; i++){
            if(a[i] + b[i] < k){
                return false;
            }
        }
        return true;
    }
}