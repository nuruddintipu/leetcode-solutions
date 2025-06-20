package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 725
 * Title: Split Linked List in Parts
 * Difficulty: Medium
 * Topic: Linked List
 * Link: https://leetcode.com/problems/split-linked-list-in-parts/
 * Time Complexity: O(n)
 * Space Complexity: O(k)
 */

public class _725_SplitLinkedListInParts {
    public ListNode[] _725_SplitLinkedListInParts(ListNode head, int k) {
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            length++;
        }

        int partSize = length / k;
        int remainder = length % k;

        curr = head;
        ListNode[] splittedNodes = new ListNode[k];

        for (int i = 0; i < k; i++) {
            int partLength = partSize + (i < remainder ? 1 : 0);

            if (partLength == 0) {
                splittedNodes[i] = null;
            } else {
                splittedNodes[i] = curr;
                for (int j = 0; j < partLength - 1; j++) {
                    curr = curr.next;
                }
                ListNode nextNode = curr.next;
                curr.next = null;
                curr = nextNode;
            }
        }
        return splittedNodes;
    }
}
