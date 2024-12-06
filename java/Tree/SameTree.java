/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }

        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }

        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }
}


// Leetcode problem #100
/*
 * Time complexity: O(n) 
 * We visit each node in both trees exactly once.
 * Here n is the number of nodes in the trees (asuming both trees are of the same size)
 *
 *
 * Space complexity: O(n)
 * The space complexity is determined by the maximum depth of the recursion stack. In the worst case (for a skewed tree), 
 * this could be 𝑂(𝑛), where n is the number of nodes. 
 * However, in a balanced tree, the space complexity would be 𝑂(log𝑛).
*/
