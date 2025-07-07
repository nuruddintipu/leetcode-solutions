package com.leetcode.solutions;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode ID: 347
 * Title: Top K Frequent Elements
 * Difficulty: Medium
 * Topic: Array, Hash Table, Divide & Conquer, Sorting, Heap, Bucket Sort, Counting, Quick Select
 * Link: https://leetcode.com/problems/top-k-frequent-elements/
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class _347_TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k){
        Map<Integer, Integer> freqCount = new HashMap<>();
        List<List<Integer>> buckets = new ArrayList<>();

        for(int i = 0; i <= nums.length; i++)
            buckets.add(new ArrayList<>());

        for(int n : nums)
            freqCount.put(n, freqCount.getOrDefault(n, 0) + 1);

        for(Map.Entry<Integer, Integer> entry : freqCount.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            buckets.get(freq).add(num);
        }

        int[] res = new int[k];

        int index = 0;

        for(int i = nums.length; i > 0 && index < k; i--){
            for(int n : buckets.get(i)){
                res[index++] = n;
                if(index == k) return res;
            }
        }

        return res;
    }
}
