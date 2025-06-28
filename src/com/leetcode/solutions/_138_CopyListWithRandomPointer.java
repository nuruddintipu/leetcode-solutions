package com.leetcode.solutions;

/**
 * LeetCode ID: 138
 * Title: Copy List with Random Pointer
 * Difficulty: Medium
 * Topic: Hash Table, Linked List
 * Link: https://leetcode.com/problems/copy-list-with-random-pointer/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _138_CopyListWithRandomPointer {
    private class Node {
        int val;
        Node next;
        Node random;
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if(head == null) return null;

        Node curr = head;
        while (curr != null){
            Node clonedNode = new Node(curr.val);
            clonedNode.next = curr.next;
            curr.next = clonedNode;
            curr = clonedNode.next;
        }

        curr = head;

        while(curr != null){
            if(curr.random != null)
                curr.next.random = curr.random.next;
            curr = curr.next.next;
        }


        curr = head;

        Node dummy = new Node(0);
        Node clonedCurrent = dummy;

        while(curr != null){
            Node clone = curr.next;
            clonedCurrent.next = clone;
            clonedCurrent = clone;

            curr.next = clone.next;
            curr = curr.next;
        }

        return dummy.next;
    }
}
