package com.leetcode.solutions;


import com.leetcode.common.TreeNode;

/**
 * LeetCode ID: 100
 * Title: Same Tree
 * Difficulty: Easy
 * Topic: Tree, DFS, BFS, Binary Tree
 * Link: https://leetcode.com/problems/same-tree/
 * Time Complexity: O(N)
 * Space Complexity: O(H)
 */

public class _100_SameTree {
    public boolean isSameTree(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null) return true;

        if(root1 == null || root2 == null) return false;

        if(root1.val != root2.val) return false;

        return isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
    }
}
