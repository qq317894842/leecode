package com.example.leecode;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Topic_239 {

    PriorityQueue a;


    public int[] maxSlidingWindow(int[] nums, int k) {
        int right = k - 1;
        int dp[] = new int[nums.length - right];
        Arrays.fill(dp,-100001);
        int p = 0;
        for (; p < k; p++) {
            dp[0] = Math.max(dp[0], nums[p]);
        }
        for (int i = 1; i < dp.length; i++, p++) {
            if (nums[i - 1] == dp[i - 1]) {
                dp[i] = nums[i];
                for (int j = i + 1; j <= p; j++) {
                    dp[i] = Math.max(dp[i], nums[j]);
                }
            } else {
                dp[i] =dp[i - 1] > nums[p] ? dp[i - 1] : nums[p];
            }
        }
        return dp;
    }

    public static void main(String[] args) {
        Topic_239 topic = new Topic_239();
        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] nums2 = topic.maxSlidingWindow(nums, k);
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + "  ");
        }
    }
}
