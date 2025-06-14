package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 25
 * Title: Reverse Nodes in K-Group
 * Difficulty: Hard
 * Topic: Linked List, Recursion
 * Link: https://leetcode.com/problems/reverse-nodes-in-k-group/
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class _25_ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k){
        if(head == null || k <= 1) return head;

        ListNode node = head;
        for(int i = 0; i < k; i++){
            if(node == null) return head;
            node = node.next;
        }

        ListNode newHead = reverseSegment(head, k);
        head.next = reverseKGroup(node, k);

        return newHead;
    }

    private ListNode reverseSegment(ListNode head, int k){
        ListNode prev = null, current = head, nextNode;

        while (k-- > 0) {
            nextNode = current.next;
            current.next = prev;

            prev = current;
            current = nextNode;
        }

        return prev;
    }

}
