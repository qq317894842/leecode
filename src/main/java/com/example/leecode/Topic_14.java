package com.example.leecode;

/**
 * @Auther: HuangRui
 * @Date: 2020/12/30 17:02
 * @Description:
 */
public class Topic_14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        String ans = strs[0];
        for(int i=1;i<strs.length;i++){
            int j=0;
            for(;j<ans.length()&&j<strs[i].length();j++){
                if(ans.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
            }
            ans = ans.substring(0,j);
        }
        return  ans;
    }

    public static void main(String[] args) {
        Topic_14 topic_14= new Topic_14();
        String str = topic_14.longestCommonPrefix(new String[]{"flower","flow","flight"});
        System.out.println(str);
    }
}
