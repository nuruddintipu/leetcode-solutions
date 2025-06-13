package com.leetcode.solutions;

/**
 * LeetCode ID: 209
 * Title: Minimum Size Subarray Sum
 * Difficulty: Medium
 * Topic: Array, Binary Search, Sliding Window, Prefix Sum
 * Link: https://leetcode.com/problems/minimum-size-subarray-sum/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 *Approach:
 * Use a sliding window technique with two pointers (left and right).
 * Expand the window by moving the right pointer and adding elements to the sum.
 * When the sum becomes >= target, try to shrink the window from the left to find the minimum length.
 * While shrinking, update the minimum length and subtract the left element from the sum.
 * Continue until the sum becomes < target, then expand the window again.
 * Return the minimum length found, or 0 if no valid subarray exists.
 *
 */

public class _209_MinSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        int left = 0, right = 0, minLen = Integer.MAX_VALUE, sum = 0;

        while (right < nums.length) {
            sum += nums[right++];
            while (sum >= s) {
                minLen = Math.min(minLen, right - left);
                sum -= nums[left++];
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
