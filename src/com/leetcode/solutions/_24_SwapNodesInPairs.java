package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 24
 * Title: Swap Nodes In Pairs
 * Difficulty: Medium
 * Topic: Linked List, Recursion
 * Link: https://leetcode.com/problems/swap-nodes-in-pairs/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _24_SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode newNode = head.next;

        head.next = swapPairs(newNode.next);

        newNode.next = head;
        return newNode;
    }
}
