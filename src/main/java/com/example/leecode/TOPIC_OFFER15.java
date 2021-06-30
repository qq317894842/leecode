package com.example.leecode;

import java.util.*;

/**
 * @Auther: HuangRui
 * @Date: 2021/6/22 11:37
 * @Description:
 */
public class TOPIC_OFFER15 {
    public static void main(String[] args) {
        TOPIC_OFFER15 t = new TOPIC_OFFER15();
        System.out.println(t.hammingWeight(-2147483648));

    }


    public int hammingWeight(int n) {
        int result = 0;
        while ((n>>>1)!=0||n>0){
            int temp = n>>>1;
            temp = temp<<1;
            result = n - temp == 1?++result:result;
            n = n>>>1;
        }

        return  result;
    }




}
