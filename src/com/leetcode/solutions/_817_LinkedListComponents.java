package com.leetcode.solutions;

import com.leetcode.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode ID: 817
 * Title: Linked List Components
 * Difficulty: Medium
 * Topic: Array, Hash Table, Linked List
 * Link: https://leetcode.com/problems/linked-list-components/
 * Time Complexity: O(n)
 * Space Complexity: O(G)
 */

public class _817_LinkedListComponents {
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) numSet.add(num);

        int componentCount = 0;
        ListNode currentNode = head;
        while (currentNode != null) {
            if (numSet.contains(currentNode.val) && (currentNode.next == null || !numSet.contains(currentNode.next.val)))
                componentCount++;

            currentNode = currentNode.next;
        }

        return componentCount;
    }
}
