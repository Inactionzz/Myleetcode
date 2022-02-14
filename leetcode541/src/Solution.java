public class Solution {
   // StringBuffer类和String一样，也用来代表字符串，只是由于StringBuffer的内部实现方式和String不同，所以StringBuffer在进行字符串处理时，不生成新的对象，在内存使用上要优于String类。
    public String reverseStr(String s, int k) {
        StringBuffer res = new StringBuffer();
        int length = s.length();
        int start = 0;
        while (start < length) {
            // 找到k处和2k处
            StringBuffer temp = new StringBuffer();
            // 与length进行判断，如果大于length了，那就将其置为length
            int firstK = (start + k > length) ? length : start + k;
            int secondK = (start + (2 * k) > length) ? length : start + (2 * k);

            //无论start所处位置，至少会反转一次
            temp.append(s.substring(start, firstK));
            res.append(temp.reverse());

            // 如果firstK到secondK之间有元素，这些元素直接放入res里即可。
            if (firstK < secondK) { //此时剩余长度一定大于k。
                res.append(s.substring(firstK, secondK));
            }
            start += (2 * k);
        }
        return res.toString();
    }
    //解法2：
    public String reverseStr2(String s, int k) {
        //将字符串转换为字符
        char[] ch = s.toCharArray();
        //每隔2k个字符就将前k个字符进行反转
        for (int i = 0; i < ch.length; i+=2*k) {
            //剩余的字符少于2K大于k则将前k个字符进行反转
            if (i+k<=ch.length){
                reverse(ch,i,i+k-1);
                continue;
            }

            //剩余字符少于k个，则将剩余的字符全部反转
            reverse(ch,i,ch.length-1);
        }
        return new String(ch);


    }
    public  void reverse(char[] ch , int i , int j) {
        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j++;
        }
    }

}
