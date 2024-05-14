package java.LinkedList;
// Leetcode problem #83
// Time Complexity: O(n), where n is the number of nodes in the linked list.
// Space Complexity: O(1), as only a constant amount of extra space is used.
// Deletes duplicate nodes from a sorted linked list, keeping only distinct values.

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

public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode unique = null; // Pointer to the head of the new list containing unique values.
        ListNode lastNode = null; // Pointer to the last node in the new list.
        ListNode current = head; // Pointer to traverse the original list.

        // Traverse the original list
        while (current != null) {
            // If the current node is unique (different from the last node),
            // create a new node and append it to the new list.
            if (unique == null || current.val != lastNode.val) {
                if (unique == null) {
                    unique = new ListNode(current.val);
                    lastNode = unique;
                } else {
                    lastNode.next = new ListNode(current.val);
                    lastNode = lastNode.next;
                }
            }
            current = current.next; // Move to the next node in the original list.
        }
        return unique; // Return the head of the new list containing unique values.
    }
}
