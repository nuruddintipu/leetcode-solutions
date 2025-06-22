package com.leetcode.solutions;

import com.leetcode.common.ListNode;
import com.leetcode.common.TreeNode;

/**
 * LeetCode ID: 1367
 * Title: Linked List In Binary Tree
 * Difficulty: Medium
 * Topic: Linked List, Tree, Binary Tree, Depth-first Search
 * Link: https://leetcode.com/problems/linked-list-in-binary-tree/
 * Time Complexity: O(N*M)
 * Space Complexity: O(H)
 */

public class _1367_LinkedListInBinaryTree {
    public boolean isSubPath(ListNode head, TreeNode root){
        if(root == null) return false;
        return isSubPathHelper(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }


    private boolean isSubPathHelper(ListNode head, TreeNode root){
        if(head == null) return true;

        if(root == null || head.val != root.val) return false;

        return isSubPathHelper(head.next, root.left) || isSubPathHelper(head.next, root.right);
    }
}

