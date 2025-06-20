package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 237
 * Title: Delete Node in a Linked List
 * Difficulty: Medium
 * Topic: Linked List
 * Link: https://leetcode.com/problems/delete-node-in-a-linked-list/
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

public class _237_DeleteNodeInALinkedList {
    public void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
