package com.leetcode.solutions;

import com.leetcode.common.ListNode;

import java.util.Random;

/**
 * LeetCode ID: 382
 * Title: Linked List Random Node
 * Difficulty: Medium
 * Topic: Linked List, Math, Reservoir Sampling, Randomized
 * Link: https://leetcode.com/problems/linked-list-random-node/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _382_LinkedListRandomNode {
    private ListNode head;
    private Random random;

    public _382_LinkedListRandomNode(ListNode head){
        this.head = head;
        this.random = new Random();
    }

    public int getRandom() {
        int result = head.val;
        ListNode currentNode = head.next;
        int index = 1;

        while(currentNode != null){
            if(random.nextInt(index + 1) == 0) result = currentNode.val;

            currentNode = currentNode.next;
            index++;
        }
        return  result;
    }
}
