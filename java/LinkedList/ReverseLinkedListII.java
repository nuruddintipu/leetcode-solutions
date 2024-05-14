package java.LinkedList;
// LeetCode Problem #92
// Time Complexity: O(n), where n is the number of nodes in the linked list.
// Space Complexity: O(1), as only a constant amount of extra space is used.
// Reverses the nodes of a linked list between positions left and right.


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */



public class ReverseLinkedListII {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left >= right) {
            return head;
        }
        // Create a dummy node to simplify handling edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Move prev to the node before the sublist to be reversed
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        // Reverse the sublist
        ListNode start = prev.next;
        ListNode then = start.next;
        for(int i = 0; i< right-left; i++){
            start.next = then.next;
            then.next = prev.next;
            prev.next= then;
            then = start.next;
        }

        return dummy.next;
    }
}
