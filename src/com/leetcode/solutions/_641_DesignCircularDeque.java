package com.leetcode.solutions;

/**
 * LeetCode ID: 641
 * Title: Design Circular Deque
 * Difficulty: Medium
 * Topic: Array, Linked List, Design, Queue
 * Link: https://leetcode.com/problems/design-circular-deque/
 * Time Complexity: O(1)
 * Space Complexity: O(n)
 */

public class _641_DesignCircularDeque {
    private class Node{
        int val;
        Node prev, next;
        Node(int val){
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }


    private int size, capacity;
    private Node head, tail;

    public _641_DesignCircularDeque(int k){
        this.capacity = k;
        this.size = 0;
        this.head = new Node(-1);
        this.tail = new Node(-1);

        head.next = tail;
        tail.prev = head;
    }

    public boolean insertFront(int val){
        if(isFull()) return false;
        Node newNode = new Node(val);
        Node nextNode = head.next;

        newNode.next = nextNode;
        newNode.prev = head;

        nextNode.prev = newNode;
        head.next = newNode;

        size++;
        return true;
    }

    public boolean insertLast(int val){
        if(isFull()) return false;

        Node newNode = new Node(val);
        Node prevNode = tail.prev;

        prevNode.next = newNode;
        newNode.prev = prevNode;

        newNode.next = tail;
        tail.prev = newNode;
        size++;
        return true;
    }

    public boolean deleteFront(){
        if(isEmpty()) return false;

        Node toDelete = head.next;
        Node next = toDelete.next;

        head.next = next;
        next.prev = head;
        size--;
        return true;
    }

    public boolean deleteLast(){
        if(isEmpty()) return false;

        Node toDelete = tail.prev;
        Node prev = toDelete.prev;

        tail.prev = prev;
        prev.next = tail;
        size--;
        return true;
    }

    public int getFront(){
        if(isEmpty()) return -1;

        return head.next.val;
    }

    public int getRear(){
        if(isEmpty()) return -1;

        return tail.prev.val;
    }

    public boolean isFull(){
        return size == capacity;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
