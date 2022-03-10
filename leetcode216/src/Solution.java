import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backTracking(n, k, 1, 0);
        return ans;
    }
    //sum用于计算k个数的和
    private void backTracking(int tagetsum, int k, int startindex, int Sum) {
        //剪枝
       if (tagetsum<Sum){
           return;
       }
        //确定终止条件
        //若满足k数和且和等于tagetsum
        if (path.size()==k){
            if (Sum == tagetsum) {
                ans.add(new ArrayList(path));
            }
            return;
        }
        //剪枝i <= 9 - (k - path.size()) + 1
        for (int i = startindex; i <= 9 - (k - path.size()) + 1 ; i++) {
            //处理当前节点
            path.add(i);
            Sum += i;
            //递归
            backTracking(tagetsum,k,i+1,Sum);
            //回溯
            path.removeLast();
            Sum -= i;
        }
    }
}
