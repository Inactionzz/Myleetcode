
//给定一个二叉树，判断它是否是高度平衡的二叉树。
public class Solution {
    //每层的递归的返回值应该包括当前树是否为bst和当前树的高度信息
    //定义一个私有内部类,,,,如果一个内部类只希望被外部类中的方法操作，那么可以使用private声明内部类
    private class ReturnNode{
        boolean isBST;
        int Depth;
        //方法中包含当前树的高度信息和是否为BST
        public ReturnNode(int Depth,boolean isBST){
            this.Depth = Depth;
            this.isBST = isBST;
        }
    }
    public boolean  isBalanced(TreeNode root){
        return BST(root).isBST;

    }
    public ReturnNode BST(TreeNode root){
        //条件是否终止
        if (root == null){
            return new ReturnNode(0,true);
        }
        //非平衡树有三种情况：左右子树不平衡，左右子树的高度差大于1
        ReturnNode left = BST(root.left);
        ReturnNode right = BST(root.right);
        if (left.isBST==false||right.isBST==false){
            return new ReturnNode(0,false);
        }
        if (Math.abs(left.Depth- right.Depth) > 1){
            return new ReturnNode(0,false);
        }
        //不满足以上的情况，则说明该树为平衡树，树的高度为左右子树高度的最大值加1
        return new ReturnNode(Math.max(left.Depth, right.Depth)+1,true);
    }
}




