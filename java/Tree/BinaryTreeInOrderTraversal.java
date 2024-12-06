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
    List<Integer> inOrderTraversal;
    public List<Integer> inorderTraversal(TreeNode root) {
        inOrderTraversal = new ArrayList<>();
        inOrderTraversalHelper(root);

        return inOrderTraversal;
    }

    private void inOrderTraversalHelper(TreeNode root){
        if(root == null){
            return;
        }

        inOrderTraversalHelper(root.left);
        inOrderTraversal.add(root.val);
        inOrderTraversalHelper(root.right);
    }
}



/**
 * Leetcode problem #94
 * Time Complexity: O(n)
 * - We visit each node in the tree exactly once.
 * - n is the number of nodes in the tree.

 * Space Complexity: O(n)
 * - Space is used by the list to store the inorder traversal result.
 * - In the worst case, the recursion stack will use O(n) space.
 */