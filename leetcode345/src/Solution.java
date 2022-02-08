import java.util.HashSet;
import java.util.Set;

public class Solution {
    static char[] vowels = new char[]{'a','e','i','o','u','A','E','I','O','U'};
    static Set<Character> hashset = new HashSet<>();
    static {
        for (char c:vowels){
            hashset.add(c);
        }
    }

    public String reverseVowels(String s) {
        int n = s.length();
        if (n <= 1) return s;

        char[] arr = s.toCharArray();

        int left = 0, right = n - 1;
        while (left < right) {
            // 相等则交换
            if (isVowels(arr[left]) && isVowels(arr[right])) {
                char tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;

                left++;
                right--;
            }

            // 左指针不是元音，右移一位
            if (!isVowels(arr[left])) left++;
            // 右指针不是元音，左移一位
            if (!isVowels(arr[right])) right--;
        }

        return new String(arr);


    }
    //判断是否是元音字母
    public boolean isVowels(char ch){

        return hashset.contains(ch);
    }

}
