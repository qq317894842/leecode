//package com.example.leecode;
//
//import javax.management.Query;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.concurrent.LinkedBlockingQueue;
//
///**
// * @Auther: HuangRui
// * @Date: 2021/6/30 13:50
// * @Description:
// */
//public class TOPIC_OFFER37 {
//     public static class TreeNode {
//          int val;
//          TreeNode left;
//          TreeNode right;
//         TreeNode(int x) { val = x; }
//     }
//
//    public static void main(String[] args) {
//        TreeNode treeNode1 = new TreeNode(1);
//        TreeNode treeNode2 = new TreeNode(2);
//        TreeNode treeNode3 = new TreeNode(3);
//        TreeNode treeNode4 = new TreeNode(4);
//        TreeNode treeNode5 = new TreeNode(5);
//        treeNode3.left = treeNode4;
//        treeNode3.right = treeNode5;
//        treeNode1.left = treeNode2;
//        treeNode1.right = treeNode3;
//        Codec codec = new Codec();
//        String serialize = codec.serialize(treeNode1);
//        System.out.println(serialize);
//
//    }
//
//    public static class Codec {
//
//        // Encodes a tree to a single string.
//        public String serialize(TreeNode root) {
//            Queue<TreeNode> queue = new LinkedList<TreeNode>();
//            queue.offer(root);
//            while(!queue.isEmpty()){
//
//            }
//        }
//
//        // Decodes your encoded data to tree.
//        public TreeNode deserialize(String data) {
//
//        }
//    }
//}
