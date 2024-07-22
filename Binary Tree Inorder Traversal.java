class Solution {
    public void getInorder(TreeNode root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.val);
        getInorder(root.right, inorder);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);
        return inorder;
    }
}