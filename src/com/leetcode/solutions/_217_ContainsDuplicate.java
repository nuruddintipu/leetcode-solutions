package com.leetcode.solutions;


import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode ID: 217
 * Title: Contains Duplicate
 * Difficulty: Easy
 * Topic: Array, Hash Table, Sorting
 * Link: https://leetcode.com/problems/contains-duplicate
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class _217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for(int num : nums ){
            if(seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
    }
}
