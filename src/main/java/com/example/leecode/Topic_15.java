package com.example.leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic_15 {

    /**
     * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
     *
     * 注意：答案中不可以包含重复的三元组。
     *
     * 示例：
     * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
     * 满足要求的三元组集合为：
     * [
     *   [-1, 0, 1],
     *   [-1, -1, 2]
     * ]
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums =new int[] {-1, 0, 1, 2, -1, -4};
        List<List<Integer>>  ans= new Topic_15().threeSum(nums);
        for(List<Integer> list:ans){
            for(Integer integer:list){
                System.out.print(integer+",");
            }
            System.out.println("");
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){

            int num1 = nums[i];
            if(i>1&&num1==nums[i-1]){
                continue;
            }
            int l = i+1;
            int r = nums.length-1;
            while (l<r){
                List<Integer> temp = new ArrayList<>();
                int num2=nums[l];
                int num3 =nums[r];
                if(num2==nums[l-1]&&(l+1)<nums.length&&(l-1)>i){
                    l++;
                    continue;
                }

                int sum = num1+num2+num3;
                if(sum==0){
                    temp.add(num1);
                    temp.add(num2);
                    temp.add(num3);
                    ans.add(temp);
                }
                if(sum>0){
                    r--;
                }else {
                    l++;
                }
            }
        }
        return ans;
    }
}
