package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 92
 * Title: Reverse Linked List II
 * Difficulty: Medium
 * Topic: Linked List
 * Link: https://leetcode.com/problems/reverse-linked-list-ii/
 * Time Complexity: O(n)
 * Space Complexity: O(1) for iterative approach, O(n) for recursive and stack
 */

public class _92_ReverseLinkedListII {
    public ListNode reverseBetweenIterative(ListNode head, int startIndex, int endIndex){
        if(head == null || startIndex == endIndex) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        for(int i = 1; i < startIndex; i++) prev = prev.next;

        ListNode currentNode = prev.next;
        for(int i = 0; i < endIndex - startIndex; i++){
            ListNode temp = currentNode.next;
            currentNode.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
        }
        return dummy.next;
    }

    private ListNode successor = null;

    public ListNode reverseBetweenRecursive(ListNode head, int startIndex, int endIndex){
        if(startIndex == 1) return reverseN(head, endIndex);

        head.next = reverseBetweenRecursive(head.next, startIndex-1, endIndex-1);
        return head;
    }

    private ListNode reverseN (ListNode head, int n){
        if(n==1) {
            successor = head.next;
            return head;
        }

        ListNode last = reverseN(head.next, n-1);
        head.next.next = head;
        head.next = successor;

        return last;
    }
}
