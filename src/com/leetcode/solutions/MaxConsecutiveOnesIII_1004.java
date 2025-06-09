package com.leetcode.solutions;

/**
 * LeetCode ID: 1004
 * Title: Maximum Consecutive Ones III
 * Difficulty: Medium
 * Topic: Array, Binary Search, Sliding Window, Prefix Sum
 * Link: https://leetcode.com/problems/max-consecutive-ones-iii/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class MaxConsecutiveOnesIII_1004 {
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
