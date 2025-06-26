package com.leetcode.solutions;

import com.leetcode.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode ID: 3217
 * Title: Delete Nodes From Linked List Present In Array
 * Difficulty: Medium
 * Topic: Array, Hash Table, Linked List
 * Link: https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/
 * Time Complexity: O(n+m)
 * Space Complexity: O(m)
 */

public class _3217_DeleteNodesFromLinkedListPresentInArray {

    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> valuesToDelete = initializeSet(nums);

        ListNode dummy = new ListNode(0, head);
        ListNode current = dummy;

        while (current.next != null) {
            if (valuesToDelete.contains(current.next.val))
                current.next = current.next.next;
            else current = current.next;
        }

        return dummy.next;
    }

    private Set<Integer> initializeSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        return set;
    }
}

