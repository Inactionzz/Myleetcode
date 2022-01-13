public class Solution {
    public boolean isSymmetric(TreeNode root) {
        //边界条件
        if (root==null)
            return true;
        //从根节点开始
       return check(root,root);

    }
    //返回值：左右子树是否对称，参数
    //单层递归需要完成：左树左孩子与右树右孩子是否对称，，，，，
    public boolean check(TreeNode p,TreeNode q){

        //可直接判断非对称树的情况
        if((p==null&&q!= null)||(p!=null&&q==null))
            return false;
        if (p.val!=q.val)
            return false;
        //判断
        return check(p.left,q.right)&&check(p.right,q.left);

    }

}
