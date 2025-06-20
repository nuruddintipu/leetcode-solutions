package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 141
 * Title: Linked list Cycle
 * Difficulty: Easy
 * Topic: Hash Table, Linked List, Two Pointers
 * Link: https://leetcode.com/problems/linked-list-cycle/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _141_LinkedListCycle {
    public boolean hasCycle(ListNode head){
        if(head == null || head.next == null) return false;

        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while(fastPointer != null && fastPointer.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if(slowPointer == fastPointer) return true;
        }

        return false;
    }
}
