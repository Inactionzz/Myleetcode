import java.util.ArrayDeque;
import java.util.Stack;

public class Solution {
    //直接用栈
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        char ch;
        for (int i = 0; i <s.length() ; i++) {
            ch = s.charAt(i);
            if (stack.isEmpty()||stack.peek()!=ch){
                stack.push(ch);
            }else {
                stack.pop();
            }


        }
        //将栈中元素出栈到数组中
        String str = "";
        while (!stack.isEmpty()){
            str =  stack.pop()+str;
        }
        return str;

    }
    public String removeDuplicates2(String s){
        ArrayDeque<Character> stack = new ArrayDeque<>();
        char ch;
        for (int i = 0; i <s.length() ; i++) {
            ch = s.charAt(i);
            if (stack.isEmpty()||stack.peek()!=ch){
                stack.push(ch);
            }else {
                stack.pop();
            }


        }
        //将栈中元素出栈到数组中
        String str = "";
        while (!stack.isEmpty()){
            str =  stack.pop()+str;
        }
        return str;
    }

}
