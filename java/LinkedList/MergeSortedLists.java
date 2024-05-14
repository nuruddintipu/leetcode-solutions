import java.util.PriorityQueue;
// Leetcode problem #23
// Time complexity: O(N log K), where N is the total number of elements across all lists
// Space complexity: O(K), where K is the number of lists

// Create a priority queue (min-heap) to store the heads of all lists
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
class MergeSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        // Create a priority queue (min-heap) to store the heads of all lists
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Add the heads of all lists to the priority queue
        for (ListNode node : lists) {
            if (node != null) {
                pq.offer(node);
            }
        }

        // Create a dummy node to serve as the head of the merged list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Continue until priority queue is empty
        while (!pq.isEmpty()) {
            // extract the minimum node from the priority queue
            ListNode minNode = pq.poll();
            // Add the minimum node to the merged list
            current.next = minNode;
            current = current.next;

            // Move the pointer of the list containing the minimum node to its next element
            if (minNode.next != null) {
                pq.offer(minNode.next);
            }

        }
        return dummy.next;
    }
}