public class Merge {
    //给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
    //88
    //请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
    public static void main(String[] args) {
        int[] a = {1,2,5};
        int[] b = {3,4,6,8};
        merge(a,3,b,4);


    }
    public static void merge(int[] nums1,int m,int[] nums2,int n){
            int p1 = 0, p2 = 0;
            int[] sorted = new int[m + n];
            int cur;
            while (p1 < m || p2 < n) {
                if (p1 == m) {
                    cur = nums2[p2++];
                } else if (p2 == n) {
                    cur = nums1[p1++];
                } else if (nums1[p1] < nums2[p2]) {
                    cur = nums1[p1++];
                } else {
                    cur = nums2[p2++];
                }
                sorted[p1 + p2 - 1] = cur;
            }
            for (int i = 0; i != m + n; ++i) {
                nums1[i] = sorted[i];
            }
        }

    }

