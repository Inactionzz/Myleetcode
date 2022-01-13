public class Solution {
    public int maxDepth(TreeNode root){
        //边界条件
        if (root == null){
            return 0;
        }
        //每次递归的返回值为左右子树的高度
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        //每次递归执行：找出左右子树最大的深度
        return Math.max(leftDepth,rightDepth)+1;
    }
}
