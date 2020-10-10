package com.example.leecode;

public class Topic_11 {

    public static void main(String[] args) {
        int[] height =new int[] {1,8,6,2,5,4,8,3,7};
        System.out.println(new Topic_11().maxArea(height));
    }

    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int area = Math.min(height[i],height[j])*j;
        while (j>i){
            area = Math.max(area,Math.min(height[i],height[j])*(j-i));
            if(height[i]<=height[j]){
                i++;
            }else{
                j--;
            }

        }
        return area;
    }
}
