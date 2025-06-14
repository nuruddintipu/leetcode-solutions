package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 23
 * Title: Merge K Sorted Lists
 * Difficulty: Hard
 * Topic: Linked List, Divide and Conquer, Heap (Priority queue), Merge Sort
 * Link: https://leetcode.com/problems/merge-k-sorted-lists/
 * Time Complexity: O(nlogk)
 * Space Complexity: O(1)
 */

public class _23_MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists){
        if(lists == null || lists.length == 0) return null;
        return mergeSort(lists, 0, lists.length-1);
    }

    private ListNode mergeSort(ListNode[] lists, int left, int right){
        if(left == right) return lists[left];

        int mid = left + (right - left) / 2;
        ListNode l1 = mergeSort(lists, left, mid);
        ListNode l2 = mergeSort(lists, mid+1, right);
        return mergeTwoLists(l1, l2);
    }

    private ListNode mergeTwoLists (ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                curr.next = l1;
                l1 = l1.next;
            } else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        curr.next = (l1 == null) ? l2 : l1;

        return dummy.next;
    }
}
