public class Solution {
    //给定一个n个元素有序的（升序）整型数组nums 和一个目标值target ，写一个函数搜索nums中的 target，如果目标值存在返回下标，否则返回 -1。
    //二分查找
    public int search(int[] nums, int target) {
        int left = 0;
        int right =nums.length-1;
        while (left<=right) {
            //改进：int mid = left + (right-left)/2; 可以防止left+right溢出
            int mid = (left + right) / 2;
            if (target == nums[mid])
                return mid;
            else if (nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }
}
