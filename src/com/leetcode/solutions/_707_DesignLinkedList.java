package com.leetcode.solutions;
import com.leetcode.common.ListNode;

/**
 * LeetCode ID: 707
 * Title: Design Linked List
 * Difficulty: Medium
 * Topic: Linked List, Design
 * Link: https://leetcode.com/problems/design-linked-list/
 * Time Complexity:
 * Space Complexity:
 */

public class _707_DesignLinkedList {
    ListNode head;
    ListNode tail;
    int size;

    public _707_DesignLinkedList() {
        head = tail = null;
        size = 0;
    }

    public int get(int index) {
        if(index < 0 || index >= size) return -1;
        if(index == size - 1) return tail.val;
        if(index == 0) return head.val;

        ListNode curr = head;

        for(int i = 0; i < index; i++) curr = curr.next;
        return curr.val;
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        if(head == null){
            head = tail = newNode;
        } else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        if(tail == null){
            head = tail = newNode;
        } else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) return;
        if(index == 0) {
            addAtHead(val);
            return;
        }
        if(index == size) {
            addAtTail(val);
            return;
        }

        ListNode curr = head;
        ListNode newNode = new ListNode(val);
        for(int i = 0; i < index-1; i++) curr = curr.next;

        newNode.next = curr.next;
        curr.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;
        if(index == 0) {
            head = head.next;
        }else {
            ListNode curr = head;
            for(int i = 0; i < index - 1; i++) curr = curr.next;
            curr.next = curr.next.next;

            if(index == size - 1) tail = curr;
        }
        size--;
    }
}
