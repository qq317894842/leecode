package com.example.leecode;

/**
 * @Auther: HuangRui
 * @Date: 2021/1/5 11:41
 * @Description:
 */
public class PrintYangHuiSanJiao {

    public  static  int[]  printSj(int n){
        if(n==1){
           return new int[]{1};
        }
        if(n==2){
            return new int[]{1,1};
        }
        int [] ans = new int[n];
        ans[0] = 1;
        ans[n-1] = 1;
        for(int i=1;i<n-1;i++){
            ans[i] = printSj(n-1)[i]+printSj(n-1)[i-1];
        }
        return ans;
    }

    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            int[] ans =  printSj(i);
            for(int j=0;j<ans.length;j++){
                System.out.print(ans[j]+"    ");
            }
            System.out.println();
        }
    }
}
