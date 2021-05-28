package codingz;

/*
https://leetcode.com/problems/climbing-stairs/

70. Climbing Stairs

 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] dp = new int[n];
        return climbStairs1(n, dp);
    }

    public int climbStairs1(int n, int[] dp) {
        if (n<=2)
            return n;
        if(dp[n-1] == 0)
            dp[n-1] = climbStairs1(n-1, dp);
        if(dp[n-2] == 0)
            dp[n-2] = climbStairs1(n-2, dp);
        return dp[n-1] + dp[n-2];
    }

    public static void main(String[] args) {
        ClimbingStairs obj =  new ClimbingStairs();
        System.out.println(obj.climbStairs(1));
        System.out.println(obj.climbStairs(2));
        System.out.println(obj.climbStairs(3));
        System.out.println(obj.climbStairs(4));
    }
}
