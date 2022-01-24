import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int fourCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                for (int k = 0; k < nums3.length; k++) {
                    for (int l = 0; l < nums4.length; l++) {
                        if (nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0) {
                            count++;

                        }

                    }

                }

            }

        }
        return count;
    }

    //哈希法
    public int fourCount2(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        int count = 0;
        //首先统计俩个元素之和其出现的次数
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int temp = nums1[i] + nums2[j];
                if (hashmap.containsKey(temp)) {
                    //这里用get获取key对应的value,相同则+1
                    hashmap.put(temp, hashmap.get(temp) + 1);
                }else {
                    hashmap.put(temp, 1);
                }
            }
        }
        //统计剩余两个，在map中寻找是否存在，同时记录出现的次数
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                int temp = nums3[i] + nums4[j];
                if (hashmap.containsKey(0 - temp)) {
                    count += hashmap.get(0 - temp);
                }
            }
        }
        return count;

    }
}
