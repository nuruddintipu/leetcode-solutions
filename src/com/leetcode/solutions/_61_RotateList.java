package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 61
 * Title: Rotate List
 * Difficulty: Medium
 * Topic: Linked List, Two Pointer
 * Link: https://leetcode.com/problems/rotate-list/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _61_RotateList {
    public ListNode rotateRight(ListNode head, int k){
        if(head == null || head.next == null || k == 0) return head;
        int length = countLength(head);

        k = k % length;
        if(k == 0) return head;

        ListNode fast = head, slow = head;
        for(int i = 0; i < k; i++) fast = fast.next;

        while(fast != null && fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        ListNode newHead = slow.next;
        slow.next = null;
        fast.next = head;

        return newHead;
    }

    private int countLength(ListNode head){
        int length = 1;
        ListNode curr = head;
        while(curr.next != null){
            length++;
            curr = curr.next;
        }
        return length;
    }
}
