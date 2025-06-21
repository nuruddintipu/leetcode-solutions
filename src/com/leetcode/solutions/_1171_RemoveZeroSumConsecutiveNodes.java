package com.leetcode.solutions;

import com.leetcode.common.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode ID: 1171
 * Title: Remove Zero Sum Consecutive Nodes from Linked List
 * Difficulty: Medium
 * Topic: Hash Table, Linked List
 * Link: https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class _1171_RemoveZeroSumConsecutiveNodes {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        Map<Integer, ListNode> prefixSumMap = mapPrefixSum(head);
        removeSublists(prefixSumMap, dummy);

        return dummy.next;
    }

    private void removeSublists(Map<Integer, ListNode> prefixSumMap, ListNode head){
        int prefixSum = 0;
        while(head != null){
            prefixSum += head.val;
            ListNode lastOccurence = prefixSumMap.get(prefixSum);

            if(head.next != lastOccurence.next) head.next = lastOccurence.next;
            head = head.next;
        }
    }

    private Map<Integer, ListNode> mapPrefixSum(ListNode head){
        Map<Integer, ListNode> prefixSumMap = new HashMap<>();
        int prefixSum = 0;
        ListNode currentNode = new ListNode(0, head);

        while(currentNode != null){
            prefixSum += currentNode.val;
            prefixSumMap.put(prefixSum, currentNode);
            currentNode = currentNode.next;
        }

        return prefixSumMap;
    }
}
