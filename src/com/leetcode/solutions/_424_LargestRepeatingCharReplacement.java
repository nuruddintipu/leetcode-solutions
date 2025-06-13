package com.leetcode.solutions;

/**
 * LeetCode ID: 424
 * Title: Largest Repeating Character Replacement
 * Difficulty: Medium
 * Topic: Hash Table, String, Sliding window0
 * Link: https://leetcode.com/problems/longest-repeating-character-replacement/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * Maintain a window with two pointers (left and right).
 * Keep track of the count of each character inside the window.
 * Calculate the number of changes needed = window size - max frequency character count.
 * If changes > k, shrink the window from the left.
 * Keep track of the maximum window size found.
 *
 */

public class _424_LargestRepeatingCharReplacement {
    private String inputString;

    public int characterReplacement(String s, int k) {
        this.inputString = s;
        int left = 0;
        int right = 0;
        int maxFreqInWindow = 0;
        int[] charFrequency = new int[26];
        int maxLength = 0;

        while (right < s.length()) {
            charFrequency[getCharIndex(right)]++;
            maxFreqInWindow = Math.max(maxFreqInWindow, charFrequency[getCharIndex(right)]);

            if (calculateWindowSize(left, right) > maxFreqInWindow + k) {
                charFrequency[getCharIndex(left)]--;
                left++;
            }

            maxLength = Math.max(maxLength, calculateWindowSize(left, right));
            right++;
        }
        return maxLength;
    }

    private int getCharIndex(int idx) {
        return getCharAtIndex(idx) - 'A';
    }

    private int calculateWindowSize(int left, int right) {
        return right - left + 1;
    }

    private char getCharAtIndex(int idx) {
        return inputString.charAt(idx);
    }
}
