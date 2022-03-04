import java.util.*;

public class Solution {
    public List<Integer> largestValues(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        if (root==null){
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int len = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left!=null){
                    queue.offer(node.left);
                }
                if (node.right!=null){
                    queue.offer(node.right);
                }
            }
            //将每层的最大值放入集合
            //Collections 类提供了许多操作集合的静态方法，借助这些静态方法可以实现集合元素的排序、查找替换和复制等操作。
            ans.add(Collections.max(level));

        }
        return ans;
    }
}
