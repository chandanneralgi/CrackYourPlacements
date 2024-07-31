class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(nums, 0, result, new ArrayList<>());
        return result;
    }
    public void helper(int[] nums, int start, List<List<Integer>> result, List<Integer> list){
        result.add(new ArrayList<>(list));
        for(int i = start; i < nums.length; i++){
            list.add(nums[i]);
            helper(nums, i + 1, result, list);
            list.remove(list.size() - 1);
        }
    }
}