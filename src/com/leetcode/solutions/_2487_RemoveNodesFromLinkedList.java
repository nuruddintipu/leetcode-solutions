package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 2487
 * Title: Remove Nodes From Linked List
 * Difficulty: Medium
 * Topic: Linked List, Stack, Recursion, Monotonic Stack
 * Link: https://leetcode.com/problems/remove-nodes-from-linked-list/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _2487_RemoveNodesFromLinkedList {

    public ListNode removeNodes(ListNode head){
        ListNode reversedHead = reverse(head);

        ListNode dummy = new ListNode(0);

        ListNode current = reversedHead;
        ListNode tail = dummy;
        int maxSoFar = Integer.MIN_VALUE;
        while(current != null){
            if(current.val >= maxSoFar){
                maxSoFar = current.val;
                tail.next = current;
                tail = tail.next;
            }
            current = current.next;
        }

        tail.next = null;

        return reverse(dummy.next);
    }

    private ListNode reverse(ListNode head){
        ListNode prev = null, nextNode;
        while( head != null){
            nextNode = head.next;
            head.next = prev;

            prev = head;
            head = nextNode;
        }
        return head;
    }
}
