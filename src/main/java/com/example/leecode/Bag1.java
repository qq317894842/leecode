package com.example.leecode;

public class Bag1 {

    public static void main(String[] args) {
        int[] w = new int[]{1, 2, 3, 4, 5};
        int[] v = new int[]{50, 40, 30, 20, 10};
        int bag = 6;
        int maxValue = process(w, v, 0, bag);
        int maxValue2 = dpProcess(w,v,bag);
        System.out.println(maxValue);
        System.out.println(maxValue2);

    }

    private static int process(int[] w, int[] v, int index, int bag) {
        if (bag < 0) {
            return -1;
        }
        if(index == w.length - 1) {
            return 0;
        }


        int p1 = process(w, v, index + 1, bag);
        int p2Next = process(w, v, index + 1, bag - w[index]);
        int p2 = 0;
        if (p2Next != -1) {
            p2 = v[index] + p2Next;
        }


        return Math.max(p1, p2);
    }

    private static int dpProcess(int[] w, int[] v, int bag) {
        int N = w.length;
        int[][] dp = new int[N+1][bag+1];
        //dp[N][...] = 0;
        for(int index=N-1;index>=0;index--) {
            for(int rest=0;rest<=bag;rest++){

                int p1 = dp[index+1][rest];
                int next =rest-w[index]<0?-1:dp[index+1][rest-w[index]];
                int p2 = 0;
                if(next!=-1){
                    p2 = v[index] + next;
                }
                dp[index][rest] = Math.max(p1,p2);
            }
        }

        return dp[0][bag];

    }


}
