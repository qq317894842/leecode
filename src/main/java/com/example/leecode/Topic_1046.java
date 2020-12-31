package com.example.leecode;

/**
 * @Auther: HuangRui
 * @Date: 2020/12/30 15:50
 * @Description:
 */
public class Topic_1046 {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1){
            return stones[0];
        }
        sort(stones);
        while (stones[1]!=0){
            if(stones[0]==stones[1]){
                stones[0]=0;
                stones[1]=0;
            }else {
                stones[0]=stones[0]-stones[1];
                stones[1]=0;
            }
            sort(stones);
        }
        return stones[0];
    }

    private void sort(int[] stones){
        for(int i=0;i<stones.length;i++){
            if (stones[0]<=stones[i]) {
                int temp = stones[i];
                stones[i] = stones[0];
                stones[0] = temp;
            }
            if (stones[1]<=stones[i]&&stones[i]<=stones[0]) {
                int temp = stones[i];
                stones[i] = stones[1];
                stones[1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Topic_1046 t = new Topic_1046();
        int a =  t.lastStoneWeight(new int[]{3,7,8});
        System.out.println(a);
    }


}
