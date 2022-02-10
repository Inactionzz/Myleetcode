public class Solution {
    //暴力
    public int removeElement(int[] nums, int val) {
        int lenth = nums.length;
        for (int i = 0; i < nums.length; i++) {
            //找到对应元素后，后面元素全部前移
            if (nums[i] == val) {
                for (int j = i + 1; j < nums.length; j++) {
                    nums[j - 1] = nums[j];
                }
                //i以后的数值向前移一位，为保持前移的元素被判断到需i前移一位
                i--;
                lenth--;


            }

        }
        return lenth;

    }

    //双指针（快慢指针）
    public int removeElement2(int[] nums, int val) {
        //定义i为快指针,j为慢指针
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;

    }

    //双指针优化（首尾指针）
    public int removeElement3(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] == val) {
                nums[left] = nums[right];
                right--;
            } else {
                left++;
            }
        }
        return left;

    }
}
