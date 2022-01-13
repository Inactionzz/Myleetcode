import java.lang.reflect.Array;
import java.util.Arrays;
//66
public class PlusOne {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        System.out.println((Arrays.toString(plusOne(a)) ));


    }
    public static int[] plusOne(int[] digits){
      int len = digits.length;
      for (int i = len-1;i>=0;i++){
          //最低位加1
          digits[i]++;
          //加1后位数增多取个位
          digits[i]%=10;
          //判断如无进位则直接返回
          if (digits[i]!=0){
             return digits;
          }
      }
      //若每位都是9则直接在最高位增一位
      digits = new int[len+1];
      digits[0]=1;
      return digits;
    }
}
