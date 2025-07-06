package com.leetcode.solutions;


import com.leetcode.common.TreeNode;

/**
 * LeetCode ID: 110
 * Title: Balanced Binary Tree
 * Difficulty: Easy
 * Topic: Tree, Binary Tree, DFS
 * Link: https://leetcode.com/problems/balanced-binary-tree/
 * Time Complexity: O(N)
 * Space Complexity: O(H)
 */

public class _110_BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    public int checkHeight(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = checkHeight(root.left);
        int rightHeight = checkHeight(root.right);

        if (leftHeight == -1 || rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
