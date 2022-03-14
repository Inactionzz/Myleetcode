import java.util.*;

public class Solution {
    //返回结果
    List<List<Integer>> ans = new ArrayList<>();
    //迭代符合的答案
    List<Integer> level = new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length==0){
            return ans;
        }
        //先对集合进行一次排序
        Arrays.sort(candidates);
        if (candidates[0]>target){
            return ans;
        }
        backTracking(candidates,0,0,target);
        return ans;

    }
    public void backTracking(int[] cadidates,int start,int sum,int target){
        if (sum==target){
            //将符合的答案放入集合
            ans.add(new ArrayList<>(level));
            return;
        }
        //
        for (int i = start; i < cadidates.length; i++) {
            // 如果 sum + candidates[i] > target 就终止遍历----剪枝
            //对总集合排序之后，如果下一层的sum（就是本层的 sum + candidates[i]）已经大于target，就可以结束本轮for循环的遍历
            if (sum+cadidates[i]>target){
                return;
            }
            //将集合中的数放入level中
            level.add(cadidates[i]);
            sum = sum+cadidates[i];
            //递归，从start开始，因为可以重复所以i不需要+1
            backTracking(cadidates,i,sum,target);
            //回溯
            sum -= cadidates[i];
            level.remove(level.size()-1);

            
        }


    }

}
