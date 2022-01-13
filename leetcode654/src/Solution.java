public class Solution {
    //给定一个不含重复元素的整数数组 nums 。一个以此数组直接递归构建的 最大二叉树 定义如下：

    //二叉树的根是数组 nums 中的最大元素。
    //左子树是通过数组中 最大值左边部分 递归构造出的最大二叉树。
    //右子树是通过数组中 最大值右边部分 递归构造出的最大二叉树。
    //返回有给定数组 nums 构建的 最大二叉树 。

    public TreeNode constructMaximumBinaryTree(int[] nums){
        return constructMaxTree(0,nums.length-1,nums);

    }
    public TreeNode constructMaxTree (int i,int r,int[] nums){
        //终止条件:i>r说明数组空
        if (i>r)
            return null;
        //获取最大值索引
        int j = findmax(nums,i,r);
        //单层递归实现：找当前范围为[i,r]的数组中的最大值作为root节点,并以他划分左右子树，分别构造左右子树的最大二叉树。
        //每级递归返回的信息：当前已经构造好的最大树的根节点
        TreeNode root = new TreeNode(nums[j]);
        root.left = constructMaxTree(i,j-1,nums);
        root.right = constructMaxTree(j+1,r,nums);
        return root;

    }
    public int findmax (int[] nums,int i,int r){
        //遍历数组找到最大值，返回其索引
        int max = -1;
        int maxindex = i;
        for (int j = i; j <= r; j++) {
            if (nums[j]>max) {
                max = nums[j];
                maxindex = j;
            }
        }
        return maxindex;
    }


}
