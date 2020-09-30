package com.example.leecode;

import java.util.Stack;

public class Topic_9 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1210221));
    }

    public static boolean isPalindrome(int x) {
        Integer init = x;
        if(x<0){
            return false;
        }
        if(x/10==0){
            return true;
        }
        int result = x%10;
        do{
            x/=10;
            result *= 10;
            result += (x%10);
        }while (x>=10);
        return result==init;
    }
}
