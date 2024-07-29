class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums, result, new ArrayList<>(), new boolean[nums.length]);
        return result;
    }
    public void helper(int[] nums, List<List<Integer>> result, List<Integer> currList, boolean used[]){
        if(currList.size() == nums.length){
            result.add(new ArrayList<>(currList));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])){
                continue;
            }
            used[i] = true;
            currList.add(nums[i]);
            helper(nums, result, currList, used);
            currList.remove(currList.size() - 1);
            used[i] = false;
        }
    }
}