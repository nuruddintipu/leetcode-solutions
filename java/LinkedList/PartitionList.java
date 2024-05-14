package java.LinkedList;

// Leetcode problem #86
// Time Complexity: O(n), where n is the number of nodes in the linked list.
// Space Complexity: O(1), as only a constant amount of extra space is used.
// Partitions the linked list around a specific value x.


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


public class PartitionList {

    public ListNode partition(ListNode head, int x) {
        ListNode beforeHead = new ListNode(0); // Dummy node for the list of nodes less than x
        ListNode before = beforeHead;
        ListNode afterHead = new ListNode(0); // Dummy node for the list of nodes greater than or equal to x
        ListNode after = afterHead;

        // Traverse the original list
        while (head != null) {
            // If the current node's value is less than x, append it to the before list
            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else { // If the current node's value is greater than or equal to x, append it to the after list
                after.next = head;
                after = after.next;
            }
            head = head.next; // Move to the next node in the original list
        }

        after.next = null; // Set the end of the after list to null to avoid cycles

        before.next = afterHead.next; // Merge the two lists

        return beforeHead.next; // Return the head of the merged list
    }
}
