package com.leetcode.solutions;
import java.util.*;

/**
 * LeetCode ID: 1695
 * Title: Maximum Erasure Value
 * Difficulty: Medium
 * Topic: Array, Hash Table, Sliding window
 * Link: https://leetcode.com/problems/maximum-erasure-value/
 * Time Complexity: O(n)
 * Space Complexity: O(k) where k is the number of unique elements in the window
 *
 * Approach:
 * Use a variable-size sliding window with two pointers (left and right).
 * Maintain a set to track unique elements in the current window and a running sum.
 * Expand the window by moving the right pointer and adding elements to both set and sum.
 * When a duplicate element is encountered, shrink the window from the left until the duplicate is removed.
 * Keep track of the maximum sum found across all valid windows.
 * The window always maintains a subarray with unique elements only.
 *
 */


public class MaxErasureValue_1695 {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        int left = 0, sum = 0, maxSum = 0;

        for (int right = 0; right < nums.length; right++) {
            while (uniqueNums.contains(nums[right])) {
                uniqueNums.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            uniqueNums.add(nums[right]);
            sum += nums[right];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
