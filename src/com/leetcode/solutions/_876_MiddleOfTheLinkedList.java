package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 876
 * Title: Middle Of The Linked List
 * Difficulty: Easy
 * Topic: Linked List, Two Pointers
 * Link: https://leetcode.com/problems/middle-of-the-linked-list/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _876_MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
