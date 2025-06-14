package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 206
 * Title: Reverse Linked List
 * Difficulty: Easy
 * Topic: Linked List, Recursion
 * Link: https://leetcode.com/problems/reverse-linked-list/
 * Time Complexity: O(n) for both iterative and recursive approaches
 * Space Complexity: O(1) if iterative, O(n) if recursive
 */

public class _206_ReverseLinkedList {
    public ListNode reverseListUsingRecursion(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode reverseRestOfTheList = reverseListUsingRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return reverseRestOfTheList;
    }

    public ListNode reverseListUsingIteration(ListNode head) {
        ListNode prev = null, curr = head, next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
