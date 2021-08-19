package com.example.leecode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: HuangRui
 * @Date: 2021/7/7 13:42
 * @Description:
 */
public class Topic_1711 {
    private static Map<Integer,Integer> power2Map = new HashMap<>();
    static{
        for(int i=0;i<=21;i++){
            power2Map.put((int)(Math.pow(2,i)),i);
        }
    }

    public int countPairs(int[] deliciousness) {
        int result = 0;

        for(int i=0;i<deliciousness.length;i++){
            int num1 = deliciousness[i];
            for(int j=i+1;j<deliciousness.length;j++){
                int num2 = deliciousness[j];
                if(power2Map.get(num1+num2)!=null){
                    result++;
                }
            }
        }
        result =  result % ((int)Math.pow(10,9)+7);
        return result;
    }
}
