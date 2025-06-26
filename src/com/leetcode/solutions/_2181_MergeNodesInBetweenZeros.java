package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 2181
 * Title: Merge Nodes In Between Zeros
 * Difficulty: Medium
 * Topic: Linked List, Simulation
 * Link: https://leetcode.com/problems/merge-nodes-in-between-zeros/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _2181_MergeNodesInBetweenZeros {
    public ListNode mergeNodes(ListNode head){
        ListNode prevZero = head;
        ListNode curr = head.next;
        int sum = 0;

        while(curr.next != null){
            if(curr.val == 0){
                prevZero.val = sum;
                sum = 0;
                prevZero.next = curr;
                prevZero = curr;
            } else sum += curr.val;
            curr = curr.next;
        }

        prevZero.val = sum;
        prevZero.next = null;

        return head;
    }
}
