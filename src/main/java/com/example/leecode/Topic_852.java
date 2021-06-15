package com.example.leecode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: HuangRui
 * @Date: 2021/6/3 11:46
 * @Description:
 */
public class Topic_852 {

    public static void main(String[] args) {
        System.out.println(new Topic_852().peakIndexInMountainArray(new int[]{0, 2,1, 0}));
    }


    public int peakIndexInMountainArray(int[] arr) {
        int left = 1;
        int right = arr.length - 2;
        int ans = -1;
        while (left <= right) {
            int mid = left + right >> 1;
            if (arr[mid] > arr[mid + 1]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
