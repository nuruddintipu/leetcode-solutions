package com.leetcode.solutions;


import com.leetcode.common.TreeNode;

/**
 * LeetCode ID: 104
 * Title: Maximum Depth of Binary Tree
 * Difficulty: Easy
 * Topic: Tree, DFS, BFS, Binary Tree
 * Link: https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * Time Complexity: O(N)
 * Space Complexity: O(H)
 */

public class _104_MaximumDepthOfBinaryTree {
    int maxDepth = 0;
    public int maxDepth(TreeNode root){
        dfs(root, 0);
        return maxDepth;
    }

    private void dfs(TreeNode root, int currentDepth){
        if(root == null) return;

        currentDepth++;
        if(root.left == null && root.right == null) maxDepth = Math.max(maxDepth, currentDepth);
        dfs(root.left, currentDepth);
        dfs(root.right, currentDepth);
    }
}
