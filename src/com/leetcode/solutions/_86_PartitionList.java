package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 86
 * Title: Partition List
 * Difficulty: Medium
 * Topic: Linked List, Two Pointers
 * Link: https://leetcode.com/problems/partition-list/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _86_PartitionList {
    public ListNode partition(ListNode list, int x){
        ListNode nodesLessThanX = new ListNode(0);
        ListNode nodesLessThanXIterator = nodesLessThanX;

        ListNode nodesGreaterThanX = new ListNode(0);
        ListNode nodesGreaterThanXIterator = nodesGreaterThanX;

        ListNode currentNode = list;
        while(currentNode != null){
            if(currentNode.val < x) {
                nodesLessThanXIterator.next = currentNode;
                nodesLessThanXIterator = nodesLessThanXIterator.next;
            } else{
                nodesGreaterThanXIterator.next = currentNode;
                nodesGreaterThanXIterator = nodesGreaterThanXIterator.next;
            }
            currentNode = currentNode.next;
        }
        nodesGreaterThanXIterator.next = null;

        nodesLessThanXIterator.next = nodesGreaterThanX.next;

        return nodesLessThanX.next;
    }
}
