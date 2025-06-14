package com.leetcode.solutions;

/**
 * LeetCode ID: 3423
 * Title: Maximum Difference Between Adjacent Elements in a Circular Array
 * Difficulty: Easy
 * Topic: Array
 * Link: https://leetcode.com/problems/maximum-difference-between-adjacent-elements-in-a-circular-array/
 * Time Complexity: O(n) where n = nums.length
 * Space Complexity: O(1) - only using variables for tracking maximum
 *
 * Approach:
 * Since the array is circular, we need to consider all adjacent pairs, including
 * the wrap-around pair between the last and first elements.
 *
 * Initialize maxDiff with the circular adjacent pair: abs(nums[0] - nums[n-1]).
 * Iterate through all consecutive adjacent pairs from index 0 to n-2.
 * For each pair, calculate the absolute difference and update the maximum if larger.
 * Return the maximum difference found among all adjacent pairs.
 *
 * Key insight: In a circular array, the last element is adjacent to the first element,
 * so we must include this wrap-around pair in our comparison.
 *
 */


public class _3423_MaxDiffBetweenAdjacentElementsInCircularArray {
    public int maxAdjacentDistance(int[] nums){
        int n = nums.length;
        int maxDiff = Math.abs(nums[0] - nums[n-1]);
        for(int i = 0; i < n-1; i++)
            maxDiff = Math.max(maxDiff, Math.abs(nums[i] - nums[i+1]));

        return maxDiff;
    }
}
