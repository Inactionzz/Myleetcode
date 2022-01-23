import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    //法一哈希法
    //map
    public int[] twoSum(int[] nums,int target){

        Map<Integer,Integer> hashmap = new HashMap<>();
        int[] res = new int[2];
        if (nums==null||nums.length==0){
            return res;
        }
        //将数组元素加入的hash表中,寻找target-num[i]是否存在map中
       for (int i = 0;i<nums.length;i++){
         hashmap.put(nums[i],i);
           if (hashmap.containsKey(target-nums[i])){
               res[1]=i;
               res[0]=hashmap.get(target-nums[i]);
       }
        }
        return res;
    }
}
