package com.example.leecode;

/**
 * @Auther: HuangRui
 * @Date: 2021/6/3 11:46
 * @Description:
 */
public class bag {

    public static void main(String[] args) {
        int[] weight = new int[]{1,2,3,4,5};

        int[] value =  new int[]{50,40,30,20,10};

        int bag = 7;

        int maxValue = process(weight,value,0,0,bag);
        System.out.println(maxValue);
        int maxValue2 = dpProcess(weight,value,bag);
        System.out.println(maxValue2);


    }

    private static int process(int[] weight, int[] value,int index, int alreadyW,int bag) {
        if(alreadyW>bag){
            return -1;
        }
        if(index==weight.length){
            return 0;
        }
        int p1 = process(weight, value,index+1, alreadyW, bag);
        int p2Next = process(weight, value, index+1,alreadyW+weight[index],bag);
        int p2 = -1;
        if(p2Next!=-1){
            p2 = value[index]+p2Next;
        }
        int max = Math.max(p1,p2);

        return  max;
    }


    private static int dpProcess(int[] weight, int[] value,int bag) {
        int N = weight.length;
        // 行 index  第几个货物
        // 列 bag
        int[][] dp=new int[N+1][bag+1];
        //dp[N][...]=0;
        for(int index=N-1;index>=0;index--){
            for(int rest=0;rest<=bag;rest++){
                int p1 = dp[index+1][rest];
                int p2Next = rest-weight[index]<0?-1:dp[index+1][rest-weight[index]];
                int p2 = 0;
                if(p2Next!=-1){
                    p2 = value[index]+p2Next;
                }
                dp[index][rest] = Math.max(p1,p2);
            }
        }
        return  dp[0][bag];
    }


}
