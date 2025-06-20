package com.leetcode.solutions;

import com.leetcode.common.ListNode;


/**
 * LeetCode ID: 147
 * Title: Insertion Sort List
 * Difficulty: Medium
 * Topic: Linked List, Sorting
 * Link: https://leetcode.com/problems/insertion-sort-list/
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

public class _147_InsertionSortList {
    public ListNode insertionSortList(ListNode head){
        ListNode dummy = new ListNode(0);
        ListNode currentNode = head;

        while(currentNode != null) {
            ListNode nextNode = currentNode.next;

            ListNode prev = dummy;

            while(prev.next != null && prev.next.val < currentNode.val) prev = prev.next;

            currentNode.next = prev.next;
            prev.next = currentNode;

            currentNode = nextNode;
        }

        return dummy.next;
    }
}
