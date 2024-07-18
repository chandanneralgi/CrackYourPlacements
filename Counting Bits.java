class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        for(int i=0;i<=n;i++){
            int count = 0;
            int m = i;
            while(m > 0){
                if((m & 1) == 1){
                    count++;
                }
                m >>= 1;
            }
            ans[i] = count;
        }
        return ans;
    }
}