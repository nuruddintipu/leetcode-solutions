package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 2095
 * Title: Delete the Middle Node Of A Linked List
 * Difficulty: Medium
 * Topic: Linked List, Two Pointers
 * Link: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _2095_DeleteTheMiddleNodeOfALinkedList {
    public ListNode deleteMiddle(ListNode head){
        if(head.next == null) return null;

        ListNode fast, slow;
        fast = slow = head;
        fast = fast.next.next;

        while(fast != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(slow.next != null) slow.next = slow.next.next;

        return head;
    }
}
