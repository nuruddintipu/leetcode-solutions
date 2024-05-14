package java.LinkedList;
// LeetCode Problem #82
// Time Complexity: O(n), where n is the number of nodes in the linked list.
// Space Complexity: O(1), as only a constant amount of extra space is used.
// Deletes all nodes that have duplicate values in a sorted linked list.


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


public class RemoveDuplicatesII {

    public ListNode deleteDuplicates(ListNode head) {
        // Base case: if the list is empty or has only one node, return the head.
        if (head == null || head.next == null) {
            return head;
        }

        // If the current node has a different value from its next node, keep it and move to the next node.
        if (head.val != head.next.val) {
            head.next = deleteDuplicates(head.next);
            return head;
        } else { // If the current node has the same value as its next node, skip all nodes with the same value.
            while (head.next != null && head.val == head.next.val) {
                head = head.next;
            }
            return deleteDuplicates(head.next);
        }
    }

}
