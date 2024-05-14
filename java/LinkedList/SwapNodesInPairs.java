package java.LinkedList;
// LeetCode problem #24
// Swaps pairs of nodes in a linked list recursively.
// Time Complexity: O(n), where n is the number of nodes in the linked list.
// Space Complexity: O(n), where n is the number of recursive calls made on the stack.


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


public class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        // Base case: if the list is empty or has only one node, return the head.
        if (head == null || head.next == null) {
            return head;
        }

        // Store the reference to the second node in the pair.
        ListNode newNode = head.next;

        // Recursively swap pairs starting from the third node in the pair.
        head.next = swapPairs(head.next.next);

        // Adjust the pointers to swap the nodes in the pair.
        newNode.next = head;

        return newNode; // Return the new head of the swapped list.
    }

}
