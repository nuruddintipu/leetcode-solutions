package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 1721
 * Title: Swapping Nodes In a Linked List
 * Difficulty: Medium
 * Topic: Linked List, Two Pointers
 * Link: https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _1721_SwappingNodesInALinkedList {
    public ListNode swapNodes(ListNode head, int k){
        ListNode fast;
        ListNode slow = fast = head;

        for(int i = 1; i < k; i++) fast = fast.next;

        ListNode firstNodeToBeSwapped = fast;

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        int temp = firstNodeToBeSwapped.val;
        firstNodeToBeSwapped.val = slow.val;
        slow.val = temp;

        return head;
    }
}
