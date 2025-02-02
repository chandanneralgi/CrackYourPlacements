public class Subtree of Another Tree {
    
}
//Recursive DFS
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(root==null && subRoot ==null|| root!=null && subRoot==null) return true;
        if (root==null && subRoot!=null) return false;

        if(isSame(root,subRoot)) return true;

        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }

    
    private boolean isSame(TreeNode p, TreeNode q){

        if(p==null && q==null) return true;
        if(p==null && q!=null || p!=null && q==null) return false;

        if(p.val!=q.val) return false;

        return isSame(p.left,q.left) && isSame(p.right,q.right);
    }
}