package class01.test;

import java.util.Arrays;

/**
 * @Auther: HuangRui
 * @Date: 2021/5/28 17:13
 * @Description:
 */
public class Code01 {
//    public static void main(String[] args) {
//        int[] arr = new int[]{10,23,57,59,74,95,102,120,129,130,133,142,143,153,159,192,192,193,210,214,227,262,274,279,280,280,297,335,342,342,350,353,389,391,392,396,406,420,430,435,446,458,483,484,519,519,533,564,566,570,584,595,598,640,653,656,658,738,743,751,770,785,785,813,814,817,835,837,848,869,884,891,895,897,937,954,979};
//        int L = 151;
//        int ans1 = maxPoint1(arr, L);
//        int ans2 = maxPoint2(arr, L);
//        int ans3 = test(arr, L);
//        System.out.println("1:"+ans1+"~~~2:"+ans2+"~~3:"+ans3);
//        if (ans1 != ans2 || ans2 != ans3) {
//            System.out.println("error");
//        }
//
//    }

    public static int maxPoint1(int[] arr, int L) {
        int max = 0;
        int left = 0;
        int right = 0;
        int N = arr.length;
        while (left < N) {
            while (right < N && arr[right] - arr[left] <= L) {
                right++;
            }
            max = Math.max(max, right - (left++));
        }


        return max;
    }

    public static int maxPoint2(int[] arr, int L) {

        int max = 1;
        for(int i=0;i<arr.length;i++) {
            int num = arr[i]+L;
            max = Math.max(max,nearestIndex(arr,i,num)-i+1);
        }
        return  max;
    }

    public static int nearestIndex(int[] arr,int i, int num){
        int left = i;
        int right = arr.length-1;
        int index = 0;
        while (left <= right){
            int mid = left + ((right-left)>>1);
            if(arr[mid]<=num){
                index = mid;
                left = mid+1;
            }else if(arr[mid]>num){
                right = mid-1;
            }
        }
        return index;
    }


    // for test
    public static int test(int[] arr, int L) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int pre = i - 1;
            while (pre >= 0 && arr[i] - arr[pre] <= L) {
                pre--;
            }
            max = Math.max(max, i - pre);
        }
        return max;
    }

    // for test
    public static int[] generateArray(int len, int max) {
        int[] ans = new int[(int) (Math.random() * len) + 1];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = (int) (Math.random() * max);
        }
        Arrays.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        int len = 20;
        int max = 1000;
        int testTime = 1000;
        System.out.println("测试开始");
        for (int i = 0; i < testTime; i++) {
            int L = (int) (Math.random() * max);
            int[] arr = generateArray(len, max);
            int ans1 = maxPoint1(arr, L);
            int ans2 = maxPoint2(arr, L);
            int ans3 = test(arr, L);
            if (ans1 != ans2 || ans2 != ans3) {
                for(int j=0;j<arr.length;j++) {
                    System.out.print(arr[j]+",");
                }
                System.out.println("oops!"+"1:"+ans1+"~~2:"+ans2+"~~3:"+ans3);
                break;
            }
        }

    }


}
