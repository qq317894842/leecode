package com.example.leecode;

/**
 * @Auther: HuangRui
 * @Date: 2021/6/3 11:46
 * @Description:
 */
public class Topic_879_dp {

    public static void main(String[] args) {
        Topic_879_dp topic879_dp = new Topic_879_dp();
        int mod = 1000000007;
        int n=5;
        int minProfit = 3;
        int[] group = new int[]{2,2};
        int[] profit = new int[]{2,3};
        int i = topic879_dp.profitableSchemes(n, minProfit, group, profit);
        System.out.println(i);
    }

    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int len = group.length;
        int mod = (int)1e9+7;
        int[][][] dp = new int[len+1][n+1][minProfit+1];
        dp[0][0][0] = 1;
        for(int i=1;i<=len;i++){
            int members = group[i-1];
            int earn = profit[i-1];
            for(int j=0;j<=n;j++){
                for(int k=0;k<=minProfit;k++){
                    if(j<members){
                        dp[i][j][k] = dp[i-1][j][k];
                    }else{
                        dp[i][j][k] = (dp[i-1][j][k] + dp[i-1][j-members][Math.max(0,k-earn)])%mod;
                    }
                }
            }
        }
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum += dp[len][i][minProfit]%mod;
        }

        return sum;
    }


}
