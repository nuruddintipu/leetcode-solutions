package com.leetcode.solutions;


import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode ID: 1865
 * Title: Finding Pairs with Certain Sum
 * Difficulty: Medium
 * Topic: Array, Hash Table, Design
 * Link: https://leetcode.com/problems/finding-pairs-with-a-certain-sum/
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */

public class _1865_FindingPairsWithCertainSum {

    private int[] nums1;
    private int[] nums2;
    private Map<Integer, Integer> freqMap2;

    public _1865_FindingPairsWithCertainSum(int[] nums1, int[] nums2){
        this.nums1 = nums1;
        this.nums2 = nums2;
        freqMap2 = new HashMap<>();

        for(int num : nums2)
            freqMap2.put(num, freqMap2.getOrDefault(num, 0) + 1);
    }

    public void add(int index, int val){
        int oldVal = nums2[index];
        int newVal = oldVal + val;

        nums2[index] = newVal;
        freqMap2.put(oldVal, freqMap2.get(oldVal) - 1);

        if(freqMap2.get(oldVal) == 0)
            freqMap2.remove(oldVal);

        freqMap2.put(newVal, freqMap2.getOrDefault(newVal, 0) + 1);
    }

    public int count(int tot){
        int result = 0;
        for(int a : nums1){
            int b = tot - a;
            result += freqMap2.getOrDefault(b, 0);
        }
        return result;
    }
}
