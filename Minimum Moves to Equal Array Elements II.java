class Solution {
    public int minMoves2(int[] nums) {
        int result = 0;
        int n = nums.length;
        Arrays.sort(nums);
        int mid = n / 2;
        for(int i = 0; i < n; i++){
            result += Math.abs(nums[i] - nums[mid]);
        }
        return result;
    }
}