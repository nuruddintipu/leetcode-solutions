package java.LinkedList;
// Leetcode problem #109
// Time Complexity: O(n), where n is the number of nodes in the linked list.
// Space Complexity: O(n), as additional space is used to store the elements of the linked list in an array.
// Constructs a balanced binary search tree (BST) from a sorted linked list.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


public class SortedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        // Store the values of the linked list in an array
        List<Integer> nums = new ArrayList<>();
        while (head != null) {
            nums.add(head.val);
            head = head.next;
        }

        // Convert the list of integers to an array
        int[] numsArr = new int[nums.size()];
        int i = 0;
        for (int num : nums) {
            numsArr[i++] = num;
        }

        // Build the balanced BST using the array
        return buildBST(numsArr, 0, nums.size() - 1);
    }

    // Recursively constructs a balanced BST from a sorted array
    private TreeNode buildBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = buildBST(nums, left, mid - 1);
        root.right = buildBST(nums, mid + 1, right);
        return root;
    }

}
