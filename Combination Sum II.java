class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        helper(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }
    public void helper(List<List<Integer>> result, List<Integer> currentList, int[] candidates, int target, int start){
        if(target == 0){
            result.add(new ArrayList<>(currentList));
            return;
        }
        for(int i=start; i<candidates.length && candidates[i] <= target; i++){
            if(i > start && candidates[i] == candidates[i-1]){
                continue;
            }
            currentList.add(candidates[i]);
            helper(result, currentList, candidates, target - candidates[i], i+1);
            currentList.remove(currentList.size() - 1);
        }
    }
}