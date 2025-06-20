package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 82
 * Title: Remove Duplicates from Sorted List II
 * Difficulty: Medium
 * Topic: Linked List, Two Pointers
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _82_RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode current = head;

        while (current != null){
            boolean isDuplicate = false;
            while(current.next != null && current.val == current.next.val){
                isDuplicate = true;
                current = current.next;
            }
            if(isDuplicate) prev.next = current.next;
            else prev = prev.next;
            current = current.next;
        }

        return dummy.next;
    }
}
