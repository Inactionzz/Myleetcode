import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(Node root) {
     //BFS
        List<List<Integer>> ans = new ArrayList<>();
        if (root==null){
            return ans;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int len = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                Node node = queue.poll();
                level.add(node.val);
                //将根节点的所有孩子节点加入到集合中
                List<Node> child = node.children;
                if (child.isEmpty()){
                    continue;
                }
                for (Node children : child) {
                    queue.offer(children);
                }

            }
            ans.add(level);
        }
        return ans;
    }

}
