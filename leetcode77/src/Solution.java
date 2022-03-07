import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        cobineHelp(n,k,1);
        return ans;

    }
    private void cobineHelp(int n,int k,int startIndex){
        //终止条件
        if (path.size() == k) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i <= n-(k - path.size())+1; i++) {
            //处理当前的节点
            path.add(i);
            //递归
            cobineHelp(n,k,i+1);
            //回溯,删除上一次加入的元素
            path.removeLast();

        }
    }

}
