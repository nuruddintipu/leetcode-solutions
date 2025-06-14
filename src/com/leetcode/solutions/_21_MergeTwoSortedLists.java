package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 21
 * Title: Merge Two Sorted Lists
 * Difficulty: Easy
 * Topic: Linked List, Recursion
 * Link: https://leetcode.com/problems/merge-two-sorted-lists/
 * Time Complexity: O(n+m)
 * Space Complexity: O(1)
 */

public class _21_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while( l1 != null && l2 != null ){
            if(l1.val < l2.val){
                curr.next = l1;
                l1 = l1.next;
            } else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = l1 == null ? l2 : l1;
        return dummy.next;
    }
}
