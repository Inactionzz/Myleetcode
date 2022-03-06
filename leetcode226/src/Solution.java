import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    //前序遍历
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
    //层序遍历
    public TreeNode invertTree1(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        if(root!=null){
            queue.offer(root);
        }
        while (!queue.isEmpty()){
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                TreeNode temp;
                temp = node.left;
                node.left = node.right;
                node.right = temp;
                if (node.left!=null){
                    queue.offer(node.left);
                }
                if (node.right!=null){
                    queue.offer(node.right);
                }

            }

        }
        return  root;


    }

    private void swap(TreeNode left, TreeNode right) {
        TreeNode temp =left;
        left = right;
        right = temp;
    }

}
