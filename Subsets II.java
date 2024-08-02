class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums, 0, result, new ArrayList<>());
        return result;
    }
    public static void helper(int nums[], int start, List<List<Integer>> result, List<Integer> list) {
        result.add(new ArrayList<>(list));
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i - 1]){
                continue;
            }
            list.add(nums[i]);
            helper(nums, i + 1, result, list);
            list.remove(list.size() - 1);
        }
    }
}