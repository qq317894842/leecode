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

            int sumCandis = sumCandis(candiesCount,dp,arri[0]);
            if(sumCandis<arri[1]*arri[2]&&sumCandis>arri[1]){
                resArr[i]=true;
            }
        }

        return  resArr;
    }

    private static int sumCandis(int[] candiesCount,int[] dp, int i) {
        if(i==0){
            return 0;
        }
        if(i==1){
            dp[i]=candiesCount[0];
            return dp[i];
        }
        if(dp[i]!=0){
            return dp[i];
        }
        dp[i]=sumCandis(candiesCount,dp,i-1)+candiesCount[i];
        return dp[i];
    }

    public static void main(String[] args) {
        int [] candiesCount =new int[]{7,4,5,3,8};
        int [][] queries = new int[][] {{0,2,2},{4,10,3},{3,10,100},{4,100,30},{1,3,1}};
        boolean[] arr = Topic_1744.canEat(candiesCount,queries);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
