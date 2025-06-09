package com.leetcode.solutions;

/**
 * LeetCode ID: 567
 * Title: Permutation in String
 * Difficulty: Medium
 * Topic: Hash Table, Two Pointer, String, Sliding Window
 * Link: https://leetcode.com/problems/permutation-in-string/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
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
