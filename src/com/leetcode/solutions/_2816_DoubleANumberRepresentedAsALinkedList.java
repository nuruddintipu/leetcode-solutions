package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 2816
 * Title: Double A Number Represented A Linked List
 * Difficulty: Medium
 * Topic: Linked List, Math, Stack
 * Link: https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _2816_DoubleANumberRepresentedAsALinkedList {
    public ListNode doubleIt(ListNode head){
        if(head.val > 4) head = new ListNode(0, head);

        ListNode node = head;
        while(node != null){
            node.val = (node.val << 1) % 10;
            if(node.next != null && node.next.val > 4) node.val++;
        }

        return head;
    }



//    public ListNode doubleIt(ListNode head){
//        int carry = getCarry(head);
//        if(carry>0) {
//            ListNode newNode = new ListNode(carry);
//            newNode.next = head;
//            return newNode;
//        }
//
//        return head;
//    }
//    private int getCarry(ListNode head){
//        if(head == null) return 0;
//        int carry = getCarry(head.next);
//        int doubled = (head.val << 1 )+ carry;
//        head.val = doubled % 10;
//        return doubled / 10;
//    }
}
