public class Solution {
    public String replaceSpace(String s) {
        char[] ch = s.toCharArray();
        int len = 0;
        for (int i : ch) {
            if (i==' '){
                len++;
            }
        }
        //扩充原来数组的长度
        char[] ch_pro = new char[ch.length+len*3];
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            //在空格处加入新字符
            if (c==' '){
                ch_pro[i++] = '%';
                ch_pro[i++] = '2';
                ch_pro[i++] = '0';
            }else {
                ch_pro[i++] = c;
            }

        }
        //将字符数组转换为字符串
        String str = new String(ch_pro,0, ch_pro.length);
        return str;

    }

}
