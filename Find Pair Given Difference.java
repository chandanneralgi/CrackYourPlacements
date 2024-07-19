class Solution {
    public int findPair(int n, int x, int[] arr) {
        Arrays.sort(arr);
        int si = 0;
        int ei = 1;
        
        while (si < n && ei < n) {
            if (si != ei && (arr[ei] - arr[si]) == x) {
                return 1;
            } else if ((arr[ei] - arr[si]) < x) {
                ei++;
            } else {
                si++;
            }
        }
        
        return -1;
    }
}