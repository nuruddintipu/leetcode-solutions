package com.leetcode.solutions;


import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode ID: 1
 * Title: Two Sum
 * Difficulty: Easy
 * Topic: Array, Hash Table
 * Link: https://leetcode.com/problems/two-sum/
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class _1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement))
                return new int[] {map.get(complement), i};

            map.put(nums[i], i);
        }
        return null;
    }
}
