package com.leetcode.solutions;


import com.leetcode.common.TreeNode;

/**
 * LeetCode ID: 617
 * Title: Merge Two Binary Trees
 * Difficulty: Easy
 * Topic: Tree, DFS, BFS, Binary Tree
 * Link: https://leetcode.com/problems/merge-two-binary-trees/
 * Time Complexity: O(N)
 * Space Complexity: O(H)
 */

public class _617_MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2){
        if(root1 == null) return root2;
        if(root2 == null) return root1;

        TreeNode mergedTree = new TreeNode(root1.val + root2.val);
        mergedTree.left = mergeTrees(root1.left, root2.left);
        mergedTree.right = mergeTrees(root1.right, root2.right);

        return mergedTree;
    }
}
