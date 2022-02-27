import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root==null){
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        //根节点入队
        queue.offer(root);
        while (!queue.isEmpty()){
            //每层遍历的集合
            List<Integer> level = new ArrayList<>();
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                //
                if (node.left!=null){
                    queue.offer(node.left);
                }
                if (node.right!=null){
                    queue.offer(node.right);
                }

            }
            ans.add(level);
        }
        return revese(ans);

    }
    public List<List<Integer>> revese(List<List<Integer>> list){
        int len = list.size()-1;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = len; i >=0 ; i--) {
            result.add(list.get(i));

        }
        return result;

    }

}
