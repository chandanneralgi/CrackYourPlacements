class Solution
{
    public int minSwaps(int nums[]) {
        int n = nums.length;
        
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);
        
        int swaps = 0;
        
        for (int i = 0; i < n; i++) {
            if (visited[i] || arr[i][1] == i) {
                continue;
            }
            
            int cycle_size = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = arr[j][1];
                cycle_size++;
            }
            
            if (cycle_size > 0) {
                swaps += (cycle_size - 1);
            }
        }
        
        return swaps;
    }
}