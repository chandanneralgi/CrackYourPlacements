class Solution {
    public static class Info{
        int diam;
        int height;
        public Info(int diam, int height){
            this.diam = diam;
            this.height = height;
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        Info result = diameter(root);
        return result.diam - 1;
    }
    public Info diameter(TreeNode root){
        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);
        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.height + rightInfo.height + 1);
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;
        return new Info(diam, height);
    }
}