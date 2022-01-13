public class MySqrt {
        int s;
//牛顿迭代法
        public int mySqrt(int x) {
            s=x;
            if(x==0) return 0;
            return ((int)(sqrts(x)));
        }
//(x+a/x)/2
//递归
        public double sqrts(double x){
            double res = (x + s / x) / 2;
            if (res == x) {
                return x;
            } else {
                return sqrts(res);
            }
        }
}






