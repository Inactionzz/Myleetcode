import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        //通过层次遍历遍历二叉数，计算每层的平均值
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root==null){
            return ans;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            int len = queue.size();
            //sum/n计算平均值
            Double sum=0.0;
            for (int i = 0; i < len; i++) {

                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left!=null){
                    queue.offer(node.left);
                }
                if (node.right!=null){
                    queue.offer(node.right);
                }
            }
            ans.add(sum/len);
        }
        return ans;

    }

}
