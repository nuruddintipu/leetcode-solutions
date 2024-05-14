package java.LinkedList;
// LeetCode problem #61
// Rotates the linked list to the right by k places.
// Time Complexity: O(n), where n is the number of nodes in the linked list.
// Space Complexity: O(1), as only a constant amount of extra space is used.


/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;

        // Calculate the length of the linked list
        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            length++;
            tail = tail.next;
        }

        // Adjust k to be within the range of the list length
        k %= length;
        if (k == 0) return head;

        ListNode fast = head;
        ListNode slow = head;

        // Move the fast pointer k steps ahead
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        // Move both pointers until the fast pointer reaches the end
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Rotate the list
        ListNode newNode = slow.next;
        slow.next = null;
        tail.next = head;

        return newNode;
    }
}
