public class Solution {
    public int minDepth(TreeNode root){
        //边界条件
        if (root==null)
            return 0;
        if (root.left==null&&root.right==null)
            return 1;
        //返回值：当前树的最小深度
        //单层递归操作：判断当前树的左右孩子情况:左不空，右不空，找当前树的最小深度。
        int min_depth = Integer.MAX_VALUE;
        if (root.right!=null)
            min_depth = Math.min(minDepth(root.right),min_depth);
        if (root.left!=null)
            min_depth = Math.min(min_depth,minDepth(root.left));
        return min_depth+1;
    }
}
