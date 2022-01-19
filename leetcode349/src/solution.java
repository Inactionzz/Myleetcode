import java.util.HashSet;
import java.util.Set;

public class solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0)
            return new int[0];
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        //遍历数组num1,记录hash表中
        for (int i : nums1) {
            set1.add(i);

        }
        //遍历数组num2，判断两个个表的相同元素,将相同的元素加入set2
        for (int i :nums2) {
            if (set1.contains(i)) {
                set2.add(i);
            }
        }
            //将set2转换为数组输出
            int[] arr = new int[set2.size()];
            int index = 0;
        for (int j : set2){
                arr[index++] = j;

            }

        return arr;
    }
}
