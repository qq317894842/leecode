package com.example.leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: HuangRui
 * @Date: 2021/1/12 09:51
 * @Description:
 */
public class T {

    public static void main(String[] args) {
        long a = (long)Math.pow(2,5) -1;
        a = a<<2&32;
        System.out.println(Long.toBinaryString(a));
    }

}
