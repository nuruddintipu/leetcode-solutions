package com.leetcode.solutions;

import com.leetcode.common.ListNode;

import java.util.List;

/**
 * LeetCode ID: 143
 * Title: Reorder List
 * Difficulty: Medium
 * Topic: Linked List, Two Pointers, Stack, Recursion
 * Link: https://leetcode.com/problems/reorder-list/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _143_ReorderList {
    ListNode head;
    public void reorderList(ListNode head){
        if(head == null || head.next == null) return;
        this.head = head;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = reverseList(slow.next);
        slow.next = null;
        mergeWithFirstHalf(secondHalf);
    }

    private void mergeWithFirstHalf(ListNode secondHalf){
        ListNode firstHalf = head;
        while(secondHalf != null){
            ListNode temp1 = firstHalf.next;
            ListNode temp2 = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = temp1;

            firstHalf = temp1;
            secondHalf = temp2;
        }
    }

    private ListNode reverseList(ListNode head){
        ListNode prev = null, next;

        while(head != null){
            next = head.next;
            head.next = prev;

            prev = head;
            head = next;
        }

        return prev;
    }
}
