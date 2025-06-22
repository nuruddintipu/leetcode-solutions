package com.leetcode.solutions;

/**
 * LeetCode ID: 1670
 * Title: Design Front Middle Back Queue
 * Difficulty: Medium
 * Topic: Array, Linked List, Design, Queue, Data Stream
 * Link: https://leetcode.com/problems/design-front-middle-back-queue/
 * Time Complexity: O(1)
 * Space Complexity: O(n)
 */

public class _1670_DesignFrontMiddleBackQueue {

    private class Node {
        int val;
        Node next;
        Node prev;
        Node(int val){this.val = val;}
    }

    private Node head, mid, tail;
    private int size;

    public _1670_DesignFrontMiddleBackQueue() {
        head = mid = tail = null;
        size = 0;
    }


    public void pushFront(int val) {
        Node newNode = new Node(val);
        if(size == 0){
            head = tail = mid = newNode;
        } else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            if(size%2 != 0) mid = mid.prev;
        }
        size++;
    }


    public void pushMiddle(int val) {
        Node newMid = new Node(val);
        if(size == 0){
            head = tail = mid = newMid;
        } else if(size %2 == 0){
            Node next = mid.next;
            mid.next = newMid;
            newMid.prev = mid;

            if(next != null){
                newMid.next = next;
                next.prev = newMid;
            } else tail = newMid;
            mid = newMid;
        } else{
            Node prev = mid.prev;
            newMid.next = mid;
            mid.prev = newMid;

            if(prev != null){
                prev.next = newMid;
                newMid.prev = prev;
            } else head = newMid;

            mid = newMid;
        }
        size++;
    }

    public void pushBack(int val) {
        Node newNode = new Node(val);
        if(size == 0){
            head = tail = mid = newNode;
        } else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            if(size % 2 == 0) mid=mid.next;
        }
        size++;
    }

    public int popFront() {
        if(size == 0) return -1;
        int top = head.val;
        if(size == 1){
            head = tail = mid = null;
        } else {
            head = head.next;
            head.prev = null;
            if(size % 2 == 0) mid = mid.next;
        }
        size--;
        return top;
    }

    public int popMiddle() {
        if(size == 0) return -1;

        int midVal = mid.val;
        if(size == 1){
            head = mid = tail = null;
        } else {
            Node prev = mid.prev, next = mid.next;
            if(prev != null) prev.next = next;
            else head = next;

            if(next != null) next.prev = prev;
            else tail = prev;

            mid = (size % 2 == 0) ? next : prev;
        }
        size--;
        return midVal;
    }

    public int popBack() {
        if(size == 0) return -1;

        int lastVal = tail.val;
        if(size == 1){
            head = tail = mid = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            if (size % 2 != 0) mid = mid.prev;
        }
        size--;
        return lastVal;
    }
}