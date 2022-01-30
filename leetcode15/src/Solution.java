import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    //双指针
    public List<List<Integer>> threeSum(int[] nums){
        //将数组进行排序复杂度为 O(NlogN)O(NlogN)
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        //双指针
        for (int i = 0; i < nums.length; i++) {
            //如果第一个数已经大于零则该趟循环不可能存在满足条件答案（已排序）
            if (nums[i]>0){
                return res;
            }
            //去i>0部分的重
            if (i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length-1;
            while (left<right) {
                int sum = nums[i]+nums[left]+nums[right];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    //Arrays.asList()将数组转换为List集合
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // 去重i<0部分
                    while (right > left && nums[right] == nums[right - 1]) right--;
                    while (right > left && nums[left] == nums[left + 1]) left++;
                    //继续找
                    left++;
                    right--;
                }
            }

        }
        return res;

    }
}
