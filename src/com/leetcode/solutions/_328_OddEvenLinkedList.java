package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 328
 * Title: Odd Even Linked List
 * Difficulty: Medium
 * Topic: Linked List
 * Link: https://leetcode.com/problems/odd-even-linked-list/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _328_OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode  odd = head, even = head.next, evenHead = head.next;

        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }
}
