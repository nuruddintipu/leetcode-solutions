package com.leetcode.solutions;

import com.leetcode.common.ListNode;

import java.util.List;

/**
 * LeetCode ID: 142
 * Title: Linked List Cycle II
 * Difficulty: Medium
 * Topic: Hash Table, Linked List, Two Pointers
 * Link: https://leetcode.com/problems/linked-list-cycle-ii/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _142_LinkedListCycleII {
    public ListNode detectCycle(ListNode head){
        if(head == null || head.next == null) return null;
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while(fastPointer != null && fastPointer.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if(slowPointer == fastPointer) break;
        }

        if(fastPointer == null || fastPointer.next == null) return null;

        slowPointer = head;

        while(slowPointer != fastPointer){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }

        return slowPointer;
    }
}
