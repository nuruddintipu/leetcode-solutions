package com.leetcode.common;

public class LinkedList {
    private ListNode head;
    private ListNode tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public void insertAtHead(int val){
        if(head == null){
            head = new ListNode(val);
            tail = head;
        } else {
            ListNode newNode = new ListNode(val);
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void insertAtTail(int val){
        if(tail == null){
            tail = new ListNode(val);
            head = tail;
        } else {
            ListNode newNode = new ListNode(val);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void insertAtIndex(int index, int val){
        if(index < 0 || index > size) throw new IndexOutOfBoundsException("Invalid index!");

        if(index == 0){
            insertAtHead(val);
            return;
        }

        if(index == size){
            insertAtTail(val);
            return;
        }

        ListNode newNode = new ListNode(val);
        ListNode curr = head;

        for(int i = 0; i < index - 1; i++) curr = curr.next;

        newNode.next = curr.next;
        curr.next = newNode;
        size++;
    }

    public void deleteAtHead() {
        if(head == null) throw new IndexOutOfBoundsException("List is empty!");

        if(head == tail){
            head = null;
            tail = null;
        } else
            head = head.next;
        size--;
    }

    public void deleteAtTail() {
        if(head == null) throw new IndexOutOfBoundsException("List is empty!");
        if(head.next == null) {
            head = null;
            tail = null;
        } else {
            ListNode curr = head;
            while(curr.next.next != null) curr = curr.next;
            curr.next = null;
            tail = curr;
        }
        size--;
    }

    public void deleteAtIndex(int index){
        if(index < 0 || index >= size) throw new IndexOutOfBoundsException("Invalid index!");

        if(index == 0){
            deleteAtHead();
            return;
        }

        if(index == size-1){
            deleteAtTail();
            return;
        }
        ListNode curr = head;
        for(int i = 0; i < index-1; i++) curr = curr.next;
        curr.next = curr.next.next;
        size--;
    }

    public boolean contains(int val){
        ListNode curr = head;
        while(curr != null){
            if(curr.val == val) return true;
            curr = curr.next;
        }
        return false;
    }

    public void print(){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void reverse(){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        tail = head;
        head = prev;
    }

}
