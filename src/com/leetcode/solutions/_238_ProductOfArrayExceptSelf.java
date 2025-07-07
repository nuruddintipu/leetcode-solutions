package com.leetcode.solutions;


/**
 * LeetCode ID: 238
 * Title: Product Of Array Except Self.
 * Difficulty: Medium
 * Topic: Array, Prefix Sum
 * Link: https://leetcode.com/problems/product-of-array-except-self/
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class _238_ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        res[0] = 1;
        for (int i = 1; i < n; i++)
            res[i] = res[i - 1] * nums[i - 1];


        int postfix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= postfix;
            postfix *= nums[i];
        }
        return res;
    }
}
