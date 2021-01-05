package com.example.leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: HuangRui
 * @Date: 2021/1/5 14:48
 * @Description:
 */
public class Topic_830 {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();
        char[] chars = s.toCharArray();
        int size=1;
        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1]){
                size ++;
            }else{
                if(size>2){
                    int end = i-1;
                    int start = end - (size -1);
                    List<Integer> temp = new ArrayList<>();
                    temp.add(0,start);
                    temp.add(1,end);
                    result.add(temp);
                }
                size = 1;
            }
        }
        if(size>2){
            int end = chars.length-1;
            int start = end - (size -1);
            List<Integer> temp = new ArrayList<>();
            temp.add(0,start);
            temp.add(1,end);
            result.add(temp);
        }
        return  result;
    }

    public static void main(String[] args) {
        Topic_830 topic_830 = new Topic_830();
        List<List<Integer>> array = topic_830.largeGroupPositions("aaabbcccddddeefffff");
        System.out.println(array.size());
    }
}
