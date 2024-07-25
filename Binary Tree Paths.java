class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        helper(result, root, new StringBuilder());
        return result;
    }
    public void helper(List<String> result, TreeNode root, StringBuilder sb){
        int temp = sb.length();
        if(root.left == null && root.right == null){
            sb.append(root.val);
            result.add(sb.toString());
        }else{
            sb.append(root.val);
            sb.append("->");
            if(root.left != null){
                helper(result, root.left, sb);
            }
            if(root.right != null){
                helper(result, root.right, sb);
            }
        }
        sb.setLength(temp);
    }
}