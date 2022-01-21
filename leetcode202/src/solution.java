import java.util.HashSet;
import java.util.Set;
//快乐数定义为：
//对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
//然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
//如果可以变为1，那么这个数就是快乐数。
public class solution {
    //考虑用hash集合，因为题目中说了会无限循环，那么也就是说求和的过程中，sum会重复出现，当需要快速判断一个
    //元素是否存在集合中考虑哈希法
    public boolean isHappoy(int n){
        Set<Integer> record = new HashSet<>();
        //判断在集合中是否存在相同的元素
        while (n!=1&&!record.contains(n) ){
            //将新的数加入集合中
            record.add(n);
            n=getNextnum(n);

        }
        return n==1;

    }
    //取值各位上的单数之和
    private int getNextnum(int n){
      int Sum = 0;
      int q = 0;
      while (n>0){
          //每次取个位
          q=n%10;
          //删个位继续
          n=n/10;
          Sum += q*q;
      }
      return Sum;
    }
}
