package com.example.leecode;

import java.util.ArrayList;
import java.util.List;

public class Topic_989 {
    public List<Integer> addToArrayForm(int[] a, int k) {
        List<Integer> result = new ArrayList<Integer>();
        int length = a.length;
        long sum = 0;
        for(int i=0;i<length;i++){
            sum += a[i] * (long)Math.pow(10,length-i-1);
        }
        sum += k;
        String str = sum + "";
        length = str.length();
        for(int i=0;i<length;i++){
            long pow =  (long)Math.pow(10,length-i-1);
            int temp =(int)(sum / pow);
            sum -= pow*temp;
            result.add(temp);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = new int[] {9,9,9,9,9,9,9,9,9,9};
        Topic_989 temp = new Topic_989();
        temp.addToArrayForm(a,1);
    }
}
