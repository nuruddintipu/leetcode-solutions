package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 203
 * Title: Remove Linked List Elements
 * Difficulty: Easy
 * Topic: Linked List, Recursion
 * Link: https://leetcode.com/problems/remove-linked-list-elements/
 * Time Complexity: O(n)
 * Space Complexity: O(n) or O(1)
 */

public class _203_RemoveLinkedListElements {
    public ListNode removeElementsIterative(ListNode head, int val){
        ListNode dummy = new ListNode(0, head), curr = dummy;

        while(curr.next != null){
            if(curr.next.val == val) curr.next = curr.next.next;
            else curr = curr.next;
        }

        return dummy.next;
    }

    public ListNode removeElementsRecursive(ListNode head, int val){
        if(head == null) return null;
        if(head.val == val) return removeElementsRecursive(head.next, val);
        head.next = removeElementsRecursive(head.next, val);
        return head;
    }
}
