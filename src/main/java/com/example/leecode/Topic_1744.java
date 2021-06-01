package com.example.leecode;

/**
 * @Auther: HuangRui
 * @Date: 2021/6/1 11:01
 * @Description:
 */
public class Topic_1744 {
    public static boolean[] canEat(int[] candiesCount, int[][] queries) {
        int [] dp = new int[candiesCount.length];
        boolean[] resArr = new boolean[queries.length];
        for(int i=0;i<queries.length;i++){
            int[] arri = queries[i];
            int sumCandis = sumCandis(candiesCount,dp,i);
        }

        return  resArr;
    }

    private static int sumCandis(int[] candiesCount,int[] dp, int i) {
        if(i<=1){
            return candiesCount[0];
        }
        if(dp[i]!=0){
            return dp[i];
        }
        for(int j=0;j<i;j++){
            dp[i]+=candiesCount[j];
        }
        return dp[i];
    }

    public static void main(String[] args) {

    }
}
