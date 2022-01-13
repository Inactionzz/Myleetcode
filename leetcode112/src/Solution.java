import javax.management.Query;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    //给你二叉树的根节点 root 和一个表示目标和的整数 targetSum ，判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。
    public boolean hasPathSum(TreeNode root, int targetSum){
        if (root==null)
            return false;
        //BFS创建两个链队，一个用来存储将要遍历的节点，一个储存当前分支节点值之和
        Queue<TreeNode> que_node = new LinkedList<>();
        Queue<Integer> que_val = new LinkedList<>();
        //入队
        que_node.offer(root);
        que_val.offer(root.val);
        while(!que_node.isEmpty()){
            //获取当前节点
            TreeNode now = que_node.poll();
            int temp = que_val.poll();
            if (now.left==null&&now.right==null) {
                if (temp == targetSum)
                    return true;
                else
                    continue;
            }
            //左孩子入队
            if (now.left!=null) {
                que_node.offer(now.left);
                que_val.offer(temp + now.left.val);
            }
            if (now.right!=null) {
                que_node.offer(now.right);
                que_val.offer(temp+now.right.val);
            }



        }
        return  false;

    }

}
