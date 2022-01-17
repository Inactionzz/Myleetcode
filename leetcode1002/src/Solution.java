import java.util.ArrayList;
import java.util.List;
//查找共用字符
public class Solution {
    //整体思路就是统计出搜索字符串里26个字符的出现的频率，然后取每个字符频率最小值，最后转成输出格式
    public List<String> commonChars(String[] words) {
        //结果返回list
        List<String> ans  = new ArrayList<>();
        if (words.length==0)
            return ans;
      //用数组做一哈希表，统计每个字符串中的字符的最小出现频率。
        int[] table_min = new int[26];
        //用第一组字符窜初始化table_min
        for (int i = 0; i < words[0].length(); i++) {
            //统计第一个字符串中字符的频率
            table_min[words[0].charAt(i)-'a']++;
        }

        for (int j = 1; j < words.length; j++) {
            int[] table = new int[26];
            for (int i = 0;i<words[j].length();i++){
                table[words[j].charAt(i)-'a']++;
            }
            //更新table_min 获取words数组的共用字符的最小频率
            for (int i = 0; i < 26; i++) {
                if (table[i]<table_min[i]) {
                    table_min[i] = table[i];
                }
            }

        }
        //将更新后获得的table_min转换为输出形式
        for (int i = 0; i < 26; i++) {
            //重复的也需要单个输出
            while(table_min[i]!=0){
                char ch = (char) (i+'a');
                ans.add(String.valueOf(ch));
                table_min[i]--;
            }

        }
        return ans;


    }
}
