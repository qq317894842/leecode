package com.mashibing;

public class MaxValueBag {

    public int maxValue(int[] weight,int[] value,int bag){
        if(weight==null||value==null||value.length!=weight.length||weight.length==0){
            return 0;
        }
        return process(weight,value,0,bag);
    }

    private int process(int[] weight, int[] value, int index, int bag) {
        if(bag<0){
            return -1;
        }
        if(index==weight.length){
            return 0;
        }


        //不要该商品
        int p1 = process(weight,value,index+1,bag);


        //要该商品
        int p2 = 0;
        int next = process(weight,value,index+1,bag-weight[index]);
        if(next!=-1) {
            p2 = value[index] + next;
        }

        return Math.max(p1,p2);
    }


    public static void main(String[] args) {
        int[] weight = {3,2,4,7};
        int[] value = {5,6,3,19};
        int bag = 12;
        System.out.println(new MaxValueBag().maxValue(weight,value,bag));
    }
}
