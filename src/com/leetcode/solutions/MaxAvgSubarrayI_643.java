package com.leetcode.solutions;


/**
 * LeetCode ID: 643
 * Title: Maximum Average Subarray I
 * Difficulty: Easy
 * Topic: Array, Sliding window
 * Link: https://leetcode.com/problems/maximum-average-subarray-i/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class MaxAvgSubarrayI_643 {
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
