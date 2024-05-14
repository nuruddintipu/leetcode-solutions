package java.LinkedList;
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
public class RemoveNthNodeFromEnd {
    /**
     * LeetCode problem #19
     * Removes the Nth node from the end of a singly-linked list.
     *
     * Time Complexity: O(N)
     * - The algorithm uses two pointers to traverse the list once.
     *   The 'fast' pointer moves n+1 steps ahead of the 'slow' pointer,
     *   and then both pointers move together until 'fast' reaches the end.
     *   Since each pointer can traverse the list at most once, the time
     *   complexity is O(N), where N is the number of nodes in the list.
     *
     * Space Complexity: O(1)
     * - The algorithm uses only a constant amount of extra space, regardless
     *   of the size of the input list. It creates two pointers ('fast' and 'slow')
     *   and a dummy node, but the space they occupy does not depend on the size
     *   of the list, so the space complexity is O(1).
     *
     * @param head The head of the singly-linked list.
     * @param n The position of the node to remove from the end of the list.
     * @return The head of the modified list after removing the Nth node from the end.
     */

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0); // Dummy node to handle edge cases
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;

        // Move the 'fast' pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers until 'fast' reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the Nth node from the end
        slow.next = slow.next.next;

        return dummy.next; // Return the modified list
    }
}
