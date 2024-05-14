package java.LinkedList;

// LeetCode problem #21
// Merges two sorted linked lists into a single sorted linked list.
// Time Complexity: O(n + m) where n is the number of nodes in list1 and m is the number of nodes in list2.
// Space Complexity: O(1) since only a constant amount of extra space is used.

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


public class MergeTwoList {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0); // Dummy node to facilitate the creation of the merged list.
        ListNode current = dummy; // Pointer to the current node in the merged list.

        // Traverse both lists simultaneously until one of them becomes null.
        while (list1 != null && list2 != null) {
            // Compare values of nodes from both lists and link the smaller node to the
            // merged list.
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next; // Move the pointer to the last node of the merged list.
        }

        // If one of the lists still has remaining nodes, append them to the merged
        // list.
        if (list1 != null) {
            current.next = list1;
        } else if (list2 != null) {
            current.next = list2;
        }

        return dummy.next; // Return the head of the merged list.
    }

}
