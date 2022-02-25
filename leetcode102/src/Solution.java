import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root==null){
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        //根节点入队
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int len = queue.size();
            for (int i = 0; i <len ; i++) {
                TreeNode node = queue.poll();
                //将当前节点加入队列中
                level.add(node.val);
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!= null){
                    queue.add(node.right);
                }
            }
            ans.add(level);
        }
        return ans;
    }
}
