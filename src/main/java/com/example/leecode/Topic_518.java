package com.example.leecode;

/**
 * @Auther: HuangRui
 * @Date: 2021/6/10 10:30
 * @Description:
 */
public class Topic_518 {

    public static void main(String[] args) {
        Topic_518 t518 = new Topic_518();
        int res = t518.change(5,new int[]{1,2,5});
        System.out.println(res);

    }


    public int change(int amount, int[] coins) {
        int[]  dp = new int[amount+1];
        dp[0] = 1;
        for(int i=0;i<coins.length;i++){
            int coin = coins[i];
            for(int j=coin;j<=amount;j++){
                dp[j] += dp[j-coin];
            }
        }
        return dp[amount];
    }
}
