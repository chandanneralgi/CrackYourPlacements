class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root, false);
    }

    private int helper(TreeNode node, boolean isLeft) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return isLeft ? node.val : 0;
        }
        int leftSum = helper(node.left, true);
        int rightSum = helper(node.right, false);
        return leftSum + rightSum;
    }
}
