package com.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode ID: 992
 * Title: Subarrays With K Different Integers
 * Difficulty: Hard
 * Topic: Array, Hash Table, Sliding Window, Counting
 * Link: https://leetcode.com/problems/subarrays-with-k-different-integers/
 * Time Complexity: O(n) where n = nums.length
 * Space Complexity: O(k) for the frequency map
 *
 * Approach:
 * Use the mathematical insight: subarrays with exactly K distinct =
 * subarrays with at most K distinct - subarrays with at most (K-1) distinct.
 *
 * Implement helper function atMostKDistinct() using a sliding window:
 * - Expand a window by moving right pointer and adding elements
 * - Contract a window by moving left pointer when distinct count exceeds K
 * - For each valid window position, all subarrays ending at a right pointer
 *   and starting from any position between a left and right are valid
 * - Count = (rightPointer - leftPointer + 1) represents number of such subarrays
 *
 * Key insight: It's easier to count "at most K" than "exactly K" directly.
 * The difference gives us exactly K distinct integers.
 *
 */


public class SubarraysWithKDifferentIntegers_992 {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostKDistinct(nums, k) - atMostKDistinct(nums, k-1);
    }

    private int atMostKDistinct(int[] nums, int k){
        int leftPointer = 0, rightPointer = 0, countSubarrays = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        while(rightPointer < nums.length){
            int rightNum = nums[rightPointer];
            freqMap.put(rightNum, freqMap.getOrDefault(rightNum, 0) + 1);
            while(freqMap.size() > k){
                int leftNum = nums[leftPointer];
                freqMap.put(leftNum, freqMap.get(leftNum) - 1);
                if(freqMap.get(leftNum) == 0) freqMap.remove(leftNum);
                leftPointer++;
            }
            countSubarrays += rightPointer - leftPointer + 1;
            rightPointer++;
        }
        return countSubarrays;
    }
}
