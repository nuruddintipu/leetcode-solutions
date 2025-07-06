package com.leetcode.solutions;


import com.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode ID: 872
 * Title: Leaf Similar Trees
 * Difficulty: Easy
 * Topic: Tree, DFS, Binary Tree
 * Link: https://leetcode.com/problems/leaf-similar-trees/
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */

public class _872_LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2){
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();

        dfs(root1, leaves1);
        dfs(root2, leaves2);

        return leaves1.equals(leaves2);
    }

    private void dfs(TreeNode root, List<Integer> leaves){
        if(root == null) return;
        if(root.left == null && root.right == null) leaves.add(root.val);

        dfs(root.left, leaves);
        dfs(root.right, leaves);
    }
}
