class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i< nums.length; i++){
            max = Math.max(max, nums[i]);
        }
        int arr[] = new int[max+1];
        for(int i=0; i<nums.length; i++){
            arr[nums[i]]++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= 2){
                ans.add(i);
            }
        }
        return ans;
    }
}