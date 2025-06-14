package com.leetcode.solutions;

/**
 * LeetCode ID: 2379
 * Title: Minimum Recolors to Get K Consecutive Black Blocks
 * Difficulty: Easy
 * Topic: String, Sliding Window
 * Link: https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _2379_MinRecolorsToGetKConsecutiveBlackBlocks {
    public int minimumRecolors(String blocks, int k) {
        int wBlocks = 0, rightPointer = 0, leftPointer = 0;

        while(rightPointer < k)
            if(blocks.charAt(rightPointer++) == 'W') wBlocks++;

        int minRecolor = wBlocks;
        while(rightPointer < blocks.length()){
            if(blocks.charAt(leftPointer++) == 'W') wBlocks--;
            if(blocks.charAt(rightPointer++) == 'W') wBlocks++;
            minRecolor = Math.min(minRecolor, wBlocks);
        }

        return minRecolor;
    }
}
