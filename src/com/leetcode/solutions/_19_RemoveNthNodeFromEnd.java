package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 19
 * Title: Remove Nth Node From End of List
 * Difficulty: Medium
 * Topic: Linked List, Two Pointer
 * Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _19_RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode list, int n){
        ListNode dummy = new ListNode(0);
        dummy.next = list;
        ListNode fastPointer = dummy, slowPointer = dummy;

        for(int i = 0; i <= n; i++) fastPointer = fastPointer.next;

        while(fastPointer != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }
        slowPointer.next = slowPointer.next.next;

        return dummy.next;
    }
}
