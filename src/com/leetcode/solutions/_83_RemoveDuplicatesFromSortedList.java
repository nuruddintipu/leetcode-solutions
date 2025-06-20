package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 83
 * Title: Remove Duplicates From Sorted List
 * Difficulty: Easy
 * Topic: Linked List
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _83_RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;

        ListNode uniqueNode = head, lastNode = head, currentNode = head.next;

        while(currentNode != null){
            if(currentNode.val != lastNode.val){
                lastNode.next = currentNode;
                lastNode = currentNode;
            }
            currentNode = currentNode.next;
        }

        lastNode.next = null;

        return uniqueNode;
    }
}
