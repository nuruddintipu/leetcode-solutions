package com.leetcode.solutions;

import com.leetcode.common.ListNode;

import java.util.ArrayList;

/**
 * LeetCode ID: 2130
 * Title: Maximum Twin Sum Of A Linked List
 * Difficulty: Medium
 * Topic: Linked List, Two Pointers, Stack
 * Link: https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _2130_MaximumTwinSumOfALinkedList {
    public int pairSum(ListNode head) {
        ListNode slow, fast, prev = null;
        slow = fast = head;

        while(fast!=null){
            fast = fast.next.next;
            ListNode temp = slow;
            slow=slow.next;
            temp.next = prev;
            prev = temp;
        }

        int maxSum = 0;
        while(slow!=null){
            maxSum = Math.max(maxSum, prev.val+slow.val);
            prev=prev.next;
            slow=slow.next;
        }
        return maxSum;
    }
}
