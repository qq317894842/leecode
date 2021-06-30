package com.example.leecode;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.*;

/**
 * @Auther: HuangRui
 * @Date: 2021/6/22 11:37
 * @Description:
 */
public class TOPIC_OFFER38 {
    public static void main(String[] args) {
        TOPIC_OFFER38  t = new TOPIC_OFFER38();
        String[] arr =  t.permutation("abc");
        System.out.println(arr.length);
    }


    public String[] permutation(String s) {
        Set<String> set = new HashSet<>();
        String[] arr = s.split("");
        int len = arr.length;
        StringBuilder stringBuilder = new StringBuilder();
        List<String>  stringList = Arrays.asList(arr);
        process(stringBuilder,stringList,set);
        return set.toArray(arr);

    }

    public void process(StringBuilder stringBuilder, List<String> stringList,Set<String> set){
        if(stringList.size()==1){
            stringBuilder.append(stringList.get(0));
            set.add(stringBuilder.toString());
            return;
        }

        for(int i=0;i<stringList.size();i++){
            List<String> tempList = new ArrayList();
            tempList.addAll(stringList);
            stringBuilder.append(stringList.get(i));
            tempList.remove(i);
            process(stringBuilder, tempList, set);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }


}
