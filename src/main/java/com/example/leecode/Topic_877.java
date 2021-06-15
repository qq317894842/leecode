package com.example.leecode;

import java.util.Arrays;

public class Topic_877 {

    public static void main(String[] args) {

    }

    public boolean stoneGame(int[] piles) {
        Integer sumAlex = 0;
        Integer sumLi = 0;
        sumAlexStone(piles,sumAlex,sumLi);
        return sumAlex>sumLi;
    }

    public int sumAlexStone(int[] piles,Integer sumAlex,Integer sumLi){
        int left = 0;
        int right = piles.length-1;
        if(right==0){
            return piles[0];
        }
        while (left < right) {
            int p1 = piles[left]+sumLiStone(Arrays.copyOfRange(piles, ++left, right),sumAlex,sumLi);
            int p2 = piles[right]+sumLiStone(Arrays.copyOfRange(piles, left, --right),sumAlex,sumLi);
            sumAlex += Math.max(p1,p2);
        }
        return sumAlex;
    }


    public int sumLiStone(int[] piles,Integer sumAlex,Integer sumLi){
        int left = 0;
        int right = piles.length-1;
        if(right==0){
            return piles[0];
        }
        while (left < right) {
            int p1 = piles[left]+sumAlexStone(Arrays.copyOfRange(piles, ++left, right),sumAlex,sumLi);
            int p2 = piles[right]+sumAlexStone(Arrays.copyOfRange(piles, left, --right),sumAlex,sumLi);
            sumLi += Math.max(p1,p2);
        }
        return sumLi;
    }
}
