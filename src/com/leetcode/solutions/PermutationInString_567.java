package com.leetcode.solutions;

/**
 * LeetCode ID: 567
 * Title: Permutation in String
 * Difficulty: Medium
 * Topic: Hash Table, Two Pointer, String, Sliding Window
 * Link: https://leetcode.com/problems/permutation-in-string/
 * Time Complexity: O(n) where n = s2.length()
 * Space Complexity: O(1) - fixed size arrays of 26
 *
 * Approach:
 * Use a fixed-size sliding window of length s1.length() on string s2.
 * Maintain frequency arrays for both s1 and the current window in s2.
 * Initialize the first window by counting characters in first s1.length() positions of s2.
 * Slide the window by removing the leftmost character and adding the rightmost character.
 * For each window position, compare frequency arrays to check if they match.
 * A match indicates the window contains a permutation of s1.
 * Return true immediately when a match is found, false if no match after checking all windows.
 *
 * Key insight: Two strings are permutations of each other if and only if
 * they have identical character frequency distributions.
 *
 */


public class PermutationInString_567 {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }
        if(matches(s1Count, s2Count)) return true;

        for (int i = s1.length(); i < s2.length(); i++) {
            s2Count[s2.charAt(i) - 'a']++;
            s2Count[s2.charAt(i - s1.length()) - 'a']--;
            if(matches(s1Count, s2Count)) return true;
        }

        return false;
    }
    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
