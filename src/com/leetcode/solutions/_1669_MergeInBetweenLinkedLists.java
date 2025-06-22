package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 1669
 * Title: Merge In Between Linked Lists
 * Difficulty: Medium
 * Topic: Linkd List
 * Link: https://leetcode.com/problems/merge-in-between-linked-lists/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _1669_MergeInBetweenLinkedLists {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2){
        ListNode nodeBeforeA = getNode(list1, a-1);
        ListNode nodeAtB = getNode(nodeBeforeA, b-a);

        nodeBeforeA.next = list2;

        ListNode tailOfList2 = getTail(list2);
        tailOfList2.next = nodeAtB.next;

        return list1;
    }
    private ListNode getTail(ListNode head){
        ListNode curr = head;
        while(curr.next != null)
            curr = curr.next;
        return curr;
    }
    private ListNode getNode(ListNode head, int position){
        ListNode curr = head;
        while(position-- > 0)
            curr = curr.next;
        return curr;
    }
}
