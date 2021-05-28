package class01.test;

import java.util.Arrays;

/**
 * @Auther: HuangRui
 * @Date: 2021/5/28 17:13
 * @Description:
 */
public class Code01 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 7, 10, 11, 15, 20};
        int L = 10;
    }

    public static int maxpoint1(int[] arr, int L) {
        int max = 0;
        int left = 0;
        int right = 0;
        int N = arr.length;
        while (left < N) {
            while (right < N && arr[right] - arr[left] < L) {
                right++;
            }
            max = Math.max(max, right - (left++));
        }


        return max;
    }


}
