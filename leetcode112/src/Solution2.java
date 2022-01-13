public class Solution2 {
    //DFS
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        targetSum -= root.val;
        if (root.right==null&&root.left==null) {
            if (targetSum == 0)
                return true;
        }
        //处理左孩子
        if (root.left!=null){
            boolean left = hasPathSum(root.left, targetSum);
            if (left) {
                return true;
            }
        }
        //处理右孩子
        if (root.right!=null){
            boolean right = hasPathSum(root.right,targetSum);
            if (right){
                return true;
            }
        }
        return false;

    }
}
