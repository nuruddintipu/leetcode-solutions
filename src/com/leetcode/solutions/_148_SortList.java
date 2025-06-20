package com.leetcode.solutions;

import com.leetcode.common.ListNode;
import com.leetcode.utils.LinkedListUtils;

import java.util.List;
import java.util.ListIterator;

/**
 * LeetCode ID: 148
 * Title: Sort List
 * Difficulty: Medium
 * Topic: Linged List, Merge Sort, Divide and Conquer
 * Link: https://leetcode.com/problems/sort-list/
 * Time Complexity: O(nlogn)
 * Space Complexity: O(1) for iterative, O(logn) for recursive
 */

public class _148_SortList {
//  Recursive Top-Down approach
    public ListNode sortListRecursive(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode middleNode = getMiddle(head);
        ListNode left = sortListRecursive(head);
        ListNode right = sortListRecursive(middleNode);
        return mergeTwoSortedList(left, right);
    }

    private ListNode getMiddle(ListNode head){
        ListNode fast = head, slow = head, prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if(prev != null) prev.next = null;
        return slow;
    }

    private ListNode mergeTwoSortedList(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        tail.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }



//  Iterative Bottom-Up Merge Sort
    public ListNode sortListIterative(ListNode head){
        if(head == null || head.next == null) return head;
        int lengthOfList = getLengthOfList(head);
        return mergeSort(head, lengthOfList);
    }

    private int getLengthOfList(ListNode head){
        int length = 0;
        ListNode curr = head;
        while(curr != null){
            length++;
            curr = curr.next;
        }
        return length;
    }

    private ListNode mergeSort(ListNode head, int lengthOfList){
        ListNode dummy = new ListNode(0, head);
        for(int size = 1; size < lengthOfList; size <<= 1){
            ListNode prev = dummy;
            ListNode curr = dummy.next;

            while(curr != null){
                ListNode left = curr;
                ListNode right = split(left, size);
                curr = split(right, size);

                ListNode[] merged = merge(left, right);
                prev.next = merged[0];
                prev = merged[1];
            }
        }
        return dummy.next;
    }

    private ListNode split(ListNode head, int size){
        while(head != null && --size > 0) head = head.next;

        if(head == null) return null;

        ListNode next = head.next;
        head.next = null;
        return next;
    }

    private ListNode[] merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0), tail = dummy;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        tail.next = (l1 == null) ? l2 : l1;
        while(tail.next != null) tail = tail.next;

        return new ListNode[] {dummy.next, tail};
    }
}
