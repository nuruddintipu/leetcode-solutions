package java.LinkedList;
// Leetcode problem #116
// Time Complexity: O(n), where n is the number of nodes in the binary tree.
// Space Complexity: O(h), where h is the height of the binary tree (worst case scenario).
// Connects each node to its next right node in the same level in a binary tree.

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

public class PopulateNextRightPointer {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        // Connect the left child to the right child of the same parent
        if (root.left != null) {
            root.left.next = root.right;
        }

        // Connect the right child to the left child of the next node in the same level
        if (root.right != null && root.next != null) {
            root.right.next = root.next.left;
        }

        // Recursively connect the children of the current node
        connect(root.left);
        connect(root.right);

        return root;
    }
}
