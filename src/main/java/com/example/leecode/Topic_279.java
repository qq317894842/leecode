package com.example.leecode;

import java.util.Arrays;

/**
 * @Auther: HuangRui
 * @Date: 2021/6/11 09:55
 * @Description:
 */
public class Topic_279 {

    public static void main(String[] args) {
        Topic_279 topic279 = new Topic_279();
        System.out.println(topic279.numSquares(5));
    }

    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, n + 1);
        // base case
        dp[0] = 0; // 相当于0*0
        // 状态转移方程：dp[i] = Math.min(dp[i - j*j] + 1, dp[j])
        for (int i = 0; i <= n; i++) {
            for (int j = 1; i - j * j >= 0; j++) {
                dp[i] = Math.min(dp[i - j * j] + 1, dp[i]);
            }
        }
        return dp[n];
    }


}
