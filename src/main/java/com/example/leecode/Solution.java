package com.example.leecode;

import java.util.*;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: HuangRui
 * @Date: 2021/10/25 10:00
 * @Description:
 */
public class Solution {

    public int countKDifference(int[] nums, int k) {
        int result = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if (Math.abs(nums[i]-nums[j])==1){
                    result ++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    System.out.println("第1次获取锁，这个锁是：" + this);
                    int index = 1;
                    while (true) {
                        synchronized (this) {
                            System.out.println("第" + (++index) + "次获取锁，这个锁是：" + this);
                        }
                        if (index == 10) {
                            break;
                        }
                    }
                }
            }
        }).start();
    }

}
