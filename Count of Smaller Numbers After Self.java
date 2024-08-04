class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int[] result = new int[nums.length];
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        
        FenwickTree fenwickTree = new FenwickTree(nums.length);

        for (int i = nums.length - 1; i >= 0; i--) {
            int position = Arrays.binarySearch(sortedNums, nums[i]);
            result[i] = fenwickTree.query(position);
            fenwickTree.update(position + 1, 1);
        }

        List<Integer> resultList = new ArrayList<>(result.length);
        for (int count : result) {
            resultList.add(count);
        }
        return resultList;
    }
}

class FenwickTree {
    private int[] tree;

    public FenwickTree(int size) {
        tree = new int[size + 1];
    }

    public void update(int index, int value) {
        while (index < tree.length) {
            tree[index] += value;
            index += index & -index;
        }
    }

    public int query(int index) {
        int sum = 0;
        while (index > 0) {
            sum += tree[index];
            index -= index & -index;
        }
        return sum;
    }
}