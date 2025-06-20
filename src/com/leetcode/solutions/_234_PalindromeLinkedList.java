package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 234
 * Title: Palindrome Linked List
 * Difficulty: Easy
 * Topic: Linked List, Two Pointers, Stack, Recursion
 * Link: https://leetcode.com/problems/palindrome-linked-list/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _234_PalindromeLinkedList {
    public boolean isPalindrome(ListNode head){
        if (head == null || head.next == null)
            return true;
        ListNode slow = head, fast = head;
        ListNode reverse = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            ListNode temp = slow;
            slow = slow.next;
            temp.next = reverse;
            reverse = temp;
        }

        if (fast != null)
            slow = slow.next;

        while (slow != null && slow.val == reverse.val) {
            slow = slow.next;
            reverse = reverse.next;
        }
        return slow == null;
    }
//
//    private boolean isPalindrome(ListNode l1, ListNode l2){
//        ListNode p1 = l1, p2 = l2;
//        while(p2 != null){
//            if(p1.val != p2.val) return false;
//            p1 = p1.next;
//            p2 = p2.next;
//        }
//        return true;
//    }
//
//    private ListNode getSecondHalf(ListNode head){
//        ListNode slow = head, fast = head;
//
//        while(fast.next != null && fast.next.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return reverseList(slow.next);
//    }
//
//    private ListNode reverseList(ListNode head){
//        ListNode prev = null, curr = head, nextNode;
//        while(curr != null){
//            nextNode = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = nextNode;
//        }
//        return prev;
//    }
}
