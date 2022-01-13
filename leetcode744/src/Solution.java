public class Solution {
    //直接遍历
    //二分查找：采用二分时间复杂度可以优化为 O ( log N )
    public char nextGreatestLetter(char[] letters, char target){
        int left = 0;
        int len = letters.length;
        int right = len-1;
        while(left<=right){
            int mid = (right-left)/2+left;
            if (letters[mid]>target)
                right = mid-1;
            else
                left = mid+1;

        }
        //当left=len时返回的是数组letter中的第一个元素
        //其他情况下返回mid+1，即当前target+1(有序)
        return letters[left%len];

    }
}
