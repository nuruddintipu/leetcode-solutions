package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 2
 * Title: Add Two Numbers
 * Difficulty: Medium
 * Topic: List, Math, Recursion
 * Link: https://leetcode.com/problems/add-two-numbers/
 * Time Complexity: O(max(m,n))
 * Space Complexity: O(max(m, n)
 */

public class _2_AddTwoNumbers {
    public ListNode addTwoNumbers (ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        int carry = 0;

        while(l1 != null || l2 != null || carry > 0){
            if(l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                carry += l2.val;
                l2 = l2.next;
            }

            curr.next = new ListNode(carry % 10);
            carry /= 10;
            curr = curr.next;
        }
        return dummy.next;
    }
}
