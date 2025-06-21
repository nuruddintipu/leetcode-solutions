package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 1290
 * Title: Convert Binary Number In a Linked List to Integer
 * Difficulty: Easy
 * Topic: Linked List, Math
 * Link: https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _1209_ConvertBinaryNumberInALinkedListToInteger {
    public int getDecimalValue(ListNode head) {
        int decimal = 0;
        ListNode currentNode = head;

        while(currentNode != null){
            decimal = (decimal << 1) | currentNode.val;
            currentNode = currentNode.next;
        }

        return decimal;
    }
}
