package com.leetcode.solutions;

/**
 * LeetCode ID: 430
 * Title: Flatten A Multilevel Doubly Linked List
 * Difficulty: Medium
 * Topic: Linked List, DFS, DLL
 * Link: https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Node{
    public int val;
    public Node child, next, prev;
}
public class _430_FlattenAMultilevelDoublyLinkedList {
    public Node flatten(Node head){
        if(head == null) return head;

        flattenDFS(head);
        return head;
    }

    private Node flattenDFS(Node head){
        Node current = head;
        Node last = null;

        while(current != null){
            Node nextNode = current.next;

            if(current.child != null){
                Node childNodeHead = current.child;

                Node childNodeTail = flattenDFS(childNodeHead);

                current.next = childNodeHead;
                childNodeHead.prev = current;

                if(nextNode != null){
                    childNodeTail.next = nextNode;
                    nextNode.prev = childNodeTail;
                }
                current.child = null;

                last = childNodeTail;
                current = nextNode;
            }else {
                last = current;
                current = nextNode;
            }
        }
        return last;
    }

}

