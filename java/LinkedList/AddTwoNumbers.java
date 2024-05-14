package java;
/**
 * LeetCode problem Number #2
 * Problem: Given two non-empty linked lists representing two non-negative integers,
 * where each node contains a single digit, add the two numbers and return the sum
 * as a linked list.
 *
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807
 *
 * Time Complexity: O(max(m, n)), where m and n are the lengths of the input linked lists.
 * Space Complexity: O(max(m, n)), the maximum length of the output linked list.
 */

public class AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode (int val){
            this.val = val;
        }
        ListNode (int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    // Method to add two numbers represented by linked lists
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        // Loop until both input lists and carry become null
        while (l1 != null || l2 != null || carry > 0) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            // Create a new node with the sum mod 10
            curr.next = new ListNode(carry % 10);
            carry /= 10;

            // Move the pointer to the next node
            curr = curr.next;
        }
        // Return the result list, skipping the dummy node
        return dummy.next;
    }
}
