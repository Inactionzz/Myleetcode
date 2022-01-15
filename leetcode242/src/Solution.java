public class Solution {
    public boolean isAnagram(String s, String t) {
        //长度不一致时，非异位词
        if (s.length()!=t.length()){
            return false;
        }
        //用一个容量为26的数组统计字符串中的单词出现的频次
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            //从a开始，下标增加，数组对应位统计
            table[s.charAt(i)-'a']++;
        }
        for (int j = 0; j < t.length(); j++) {
            table[t.charAt(j)-'a']--;
            //如果两个字符串不一样则必有小于0
            if (table[t.charAt(j)-'a']<0){
                return false;
            }

        }

        return true;

    }
}
