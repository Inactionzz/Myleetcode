import java.util.LinkedList;
import java.util.List;

public class Solution {
    //返回的结果
    List<String> ans = new LinkedList<>();
    //每次迭代获取一个字符串,涉及字符串的拼接故用StringBuilder
    StringBuilder level = new StringBuilder();

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()||digits.length()==0){
            return ans;
        }
        //数字对应的字符串
        String[] Str = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        //递归
        backTracking(digits,Str,0);
        return ans;



    }
    //参数num记录遍历的第几个数字，即回溯构建树的深度
    public void backTracking(String digits,String[] Str,int num){
        if (num == digits.length()){
            ans.add(level.toString());
            return;
        }
        String str = Str[digits.charAt(num) - '0'];
        for (int i = 0;i<str.length();i++){
            level.append(str.charAt(i));
            //递归
            backTracking(digits,Str,num+1);
            //回溯
            level.deleteCharAt(level.length()-1);
        }

    }


}
