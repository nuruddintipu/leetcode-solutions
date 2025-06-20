package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 160
 * Title: Intersection of Two Linked Lists
 * Difficulty: Easy
 * Topic: Hash Table, Linked List, Two Pointers
 * Link: https://leetcode.com/problems/intersection-of-two-linked-lists/
 * Time Complexity: O(n+m)
 * Space Complexity: O(1)
 */

public class _160_IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        while(a != b){
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a;
    }
}
