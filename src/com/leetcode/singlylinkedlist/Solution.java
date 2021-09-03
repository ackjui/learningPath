package com.leetcode.singlylinkedlist;

class Solution {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
        {
            return null;
        }
        
        if (l1 == null && l2 != null)
        {
            return l2;
        }
        
        if (l1 != null && l2 ==null)
        {
            return l1;
        }
        
        ListNode a = l1;
        ListNode b = l2;
        
        ListNode ans;
        
        if (a.val <= b.val)
            {
                ans = new ListNode(a.val, null);
            a = a.next;
            } else
            {
            ans = new ListNode(b.val, null);
            b = b.next;
            }
        
        while (a != null && b != null)
        {
            System.out.println("ans : " + ans.val);
            if (a.val <= b.val)
            {
                ans.next =new ListNode(a.val, null);
                a = a.next;
            } else 
            {
                ans.next = new ListNode(b.val, null);
                b = b.next;
            }
        }
        
        if (a == null)
        {
            ans.next = b;
        } else {
            ans.next = a;
        }
        return ans;
    }


    // public static void main(String[] args) {
    //     Link

    //     mergeTwoLists(l1, l2);
    // }
}