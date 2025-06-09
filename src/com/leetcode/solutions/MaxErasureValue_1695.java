package com.leetcode.solutions;
import java.util.*;

/**
 * LeetCode ID: 1695
 * Title: Maximum Erasure Value
 * Difficulty: Medium
 * Topic: Array, Hash Table, Sliding window
 * Link: https://leetcode.com/problems/maximum-erasure-value/
 * Time Complexity: O(n)
 * Space Complexity: O(k)
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
