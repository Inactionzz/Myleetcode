public class ClimbStairs {
    public int climbStairs(int n) {

      //动态规划
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        //统计个数
        return dp[n];

    }
}
