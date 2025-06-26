package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 2807
 * Title: Insert Greatest Common Divisor In Linked List
 * Difficulty: Medium
 * Topic: Linked List, Math, Number Theory
 * Link: https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _2807_InsertGreatestCommonDivisorsInLinkedList {

    public ListNode insertGreatestCommonDivisors(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode prev = head, curr = head.next;

        while(curr != null){
            int gcd = calculateGcd(prev.val, curr.val);
            ListNode newNode = new ListNode(gcd);
            prev.next = newNode;
            newNode.next = curr;
            prev = curr;
            curr = curr.next;
        }
        return head;
    }
    private int calculateGcd(int n1, int n2){
        if(n2 == 0) return n1;
        return calculateGcd(n2, n1 % n2);
    }
}
