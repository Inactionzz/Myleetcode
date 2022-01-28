public class Solution {
    //哈希法：用数组做哈希表
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        //记录magazine 中每个字符到哈希表中
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i)-'a']++;

        }
        for (int i = 0; i < ransomNote.length(); i++) {

            if (arr[ransomNote.charAt(i)-'a']>0){
                arr[ransomNote.charAt(i)-'a']--;
            }else {
                return false;
            }

        }
        return true;

    }
}
