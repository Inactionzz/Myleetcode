public class Solution {
    public TreeNode invertTree(TreeNode root){
        //边界条件
       if (root == null)
           return null;
        //返回值：返回根节点
        //单层递归：交换左右孩子
        TreeNode temp;
        temp=root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return  root;

    }

}
