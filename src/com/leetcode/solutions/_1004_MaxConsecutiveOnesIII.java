package com.leetcode.solutions;

/**
 * LeetCode ID: 1004
 * Title: Maximum Consecutive Ones III
 * Difficulty: Medium
 * Topic: Array, Binary Search, Sliding Window, Prefix Sum
 * Link: https://leetcode.com/problems/max-consecutive-ones-iii/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * Use a variable-size sliding window with two pointers (left and right).
 * Maintain a count of zeros in the current window.
 * Expand the window by moving the right pointer and counting zeros encountered.
 * When the number of zeros exceeds k, shrink the window from the left until zeros count <= k.
 * Keep track of the maximum window size found during the process.
 * The window represents the longest subarray of consecutive 1s after flipping at most k zeros.
 *
 */

public class _1004_MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int left = 0, maxLen = 0, zeroCount = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
