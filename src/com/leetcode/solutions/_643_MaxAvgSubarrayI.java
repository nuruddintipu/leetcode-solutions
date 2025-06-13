package com.leetcode.solutions;

/**
 * LeetCode ID: 643
 * Title: Maximum Average Subarray I
 * Difficulty: Easy
 * Topic: Array, Sliding window
 * Link: https://leetcode.com/problems/maximum-average-subarray-i/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * Use a fixed-size sliding window of length k.
 * Calculate the sum of the first k elements as the initial window sum.
 * Slide the window by adding the next element and removing the first element of the previous window.
 * Keep track of the maximum sum found across all windows.
 * Return the maximum sum divided by k to get the maximum average.
 * Since all subarrays have the same length k, finding max sum is equivalent to finding max average.
 *
 */


public class _643_MaxAvgSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;
        for (int i = 0; i < k; i++) windowSum += nums[i];

        int currentSum = windowSum;
        double maxAverage = (double) currentSum / k;

        for (int i = k; i < nums.length; i++) {
            currentSum = currentSum - nums[i - k] + nums[i];
            maxAverage = Math.max(maxAverage, (double) currentSum / k);
        }
        return maxAverage;
    }
}
