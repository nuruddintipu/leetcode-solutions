package java.LinkedList;
// Leetcode problem #114
// Time Complexity: O(n), where n is the number of nodes in the binary tree.
// Space Complexity: O(h), where h is the height of the binary tree (worst case scenario).
// Flattens a binary tree into a linked list in-place using a stack.


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */


public class FlattenTreeToLinkedList {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>(); // Stack to store nodes while traversing
        stack.push(root); // Push the root node onto the stack

        while (!stack.isEmpty()) {
            TreeNode currNode = stack.pop(); // Pop a node from the stack

            // Push the right child onto the stack first to ensure it is processed after the left child
            if (currNode.right != null) {
                stack.push(currNode.right);
            }
            if (currNode.left != null) {
                stack.push(currNode.left);
            }

            currNode.left = null; // Set the left child to null

            // If there are more nodes in the stack, set the right child to the top node of the stack
            if (!stack.isEmpty()) {
                currNode.right = stack.peek();
            }
        }
    }
}
