package com.example.leecode;

import org.springframework.beans.BeanUtils;

import java.util.*;

/**
 * @Auther: HuangRui
 * @Date: 2021/1/12 09:51
 * @Description:
 */
public class T {

    public static void main(String[] args) {

    }

    public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
             val = x;
              next = null;
          }
    }
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode res = null;
            while (headA!=null && headB!=null){
                if(headA.val==headB.val){
                    res = new ListNode(headA.val);
                    res.next = headA.next;
                }else {
                    res = null;
                }
                headA = headA.next;
                headB = headB.next;
            }
            return res;
        }
    }


}
