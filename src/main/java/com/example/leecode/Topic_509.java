package com.example.leecode;

import java.util.Arrays;

/**
 * @Auther: HuangRui
 * @Date: 2021/1/4 15:53
 * @Description:  1,1,2,3,5,8,13
 */
public class Topic_509 {

    public int fib(int n) {
        int[] array = new int[n+1];
        Arrays.fill(array,-1);
        return fib2(n,array);
    }

    public int fib2(int n,int[] array) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        if(array[n]!=-1){
            return array[n];
        }
        int ans = fib(n-1)+fib(n-2);
        array[n]=ans;
        return ans;
    }

    public static void main(String[] args) {
        Topic_509 topic_509 = new Topic_509();
        System.out.println(topic_509.fib(0));
    }

}
