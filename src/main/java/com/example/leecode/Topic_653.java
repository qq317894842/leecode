package com.example.leecode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: HuangRui
 * @Date: 2022/3/21 15:59
 * @Description:
 */

public class Topic_653 {

      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    Map<Integer,Integer> map = new HashMap<>();
    public boolean findTarget(TreeNode root, int k) {
          map.put(root.val,map.getOrDefault(root.val,0)+1);
          if(k==root.val*2){
              if(map.get(root.val)==2){
                  return true;
              }
          }else if(map.get(k-root.val)!=null){
              return true;
          }
          while(root.left!=null){
             boolean left = findTarget(root.left,k);
             if(left){
                 return true;
             }
             break;
          }
          while(root.right!=null){
             boolean right = findTarget(root.right,k);
             if(right){
                 return right;
             }
             break;
          }
          return false;
    }

    /**
     * 给定一个二叉搜索树 root 和一个目标结果 k，
     * 如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。
     * 输入: root = [5,3,6,2,4,null,7], k = 9
     * 输出: true
     * @param args
     */
    public static void main(String[] args) {
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode3 = new TreeNode(3,treeNode2,treeNode4);
        TreeNode treeNode6 = new TreeNode(6,null,treeNode7);
        TreeNode root5 = new TreeNode(5,treeNode3,treeNode6);
        System.out.println(new Topic_653().findTarget(root5,29));

    }
}
