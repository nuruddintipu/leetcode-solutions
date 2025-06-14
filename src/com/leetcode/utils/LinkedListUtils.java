package com.leetcode.utils;

import com.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode ID:
 * Title:
 * Difficulty:
 * Topic:
 * Link:
 * Time Complexity:
 * Space Complexity:
 */

public class LinkedListUtils {
    public static ListNode fromArray(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int num : arr) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    // Convert LinkedList to an array (useful for testing)
    public static int[] toArray(ListNode head) {
        List<Integer> result = new ArrayList<>();
        while (head != null) {
            result.add(head.val);
            head = head.next;
        }
        // Convert List<Integer> to int[]
        return result.stream().mapToInt(i -> i).toArray();
    }

    // Print the list for visual debug
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            System.out.print(" -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
