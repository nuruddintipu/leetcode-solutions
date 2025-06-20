package com.leetcode.solutions;

import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 622
 * Title: Design Circular Queue
 * Difficulty: Medium
 * Topic: Array, Linked List, Design, Queue
 * Link: https://leetcode.com/problems/design-circular-queue/
 * Time Complexity: O(1)
 * Space Complexity: O(n)
 */

public class _622_DesignCircularQueue {
    private ListNode front, rear;
    private int size, capacity;

    public _622_DesignCircularQueue(int k){
        this.capacity = k;
        this.size = 0;
        this.front = null;
        this.rear = null;
    }

    public int Front(){
        if(isEmpty()) return -1;
        return front.val;
    }

    public int Rear(){
        if(isEmpty()) return  -1;
        return rear.val;
    }

    public boolean enQueue(int val){
        if(isFull()) return false;
        ListNode newNode = new ListNode(val);

        if(isEmpty()) front = rear = newNode;
        else{
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        return true;
    }

    public boolean deQueue(){
        if(isEmpty()) return false;
        front = front.next;

        if(front == null) rear = null;
        size--;
        return true;
    }

    public boolean isFull(){
        return size == capacity;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
