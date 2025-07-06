package com.leetcode.solutions;


import com.leetcode.common.TreeNode;

/**
 * LeetCode ID: 112
 * Title: Path Sum
 * Difficulty: Easy
 * Topic: Tree, DFS, BFS, Binary Tree
 * Link: https://leetcode.com/problems/path-sum/
 * Time Complexity: O(N)
 * Space Complexity: O(H)
 */

public class _112_PathSum {
    boolean isPathSumEqualsTarget = false;
    public boolean hasPathSum(TreeNode root, int targetSum){
        if(root == null) return false;

        traverse(root, targetSum);
        return isPathSumEqualsTarget;
    }

    private void traverse(TreeNode root, int targetSum){
        if(root == null) return;

        targetSum -= root.val;
        if(root.left == null && root.right == null && targetSum == 0) isPathSumEqualsTarget = true;

        traverse(root.left, targetSum);
        traverse(root.right, targetSum);
    }
}
