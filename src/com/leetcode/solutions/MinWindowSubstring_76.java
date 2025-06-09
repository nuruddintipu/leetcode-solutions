package com.leetcode.solutions;

/**
 * LeetCode ID: 76
 * Title: Minimum Window Substring
 * Difficulty: Hard
 * Topic: Hash Table, String, Sliding window
 * Link: https://leetcode.com/problems/minimum-window-substring/
 * Time Complexity: O(n+m)
 * Space Complexity: O(m)
 */

public class MinWindowSubstring_76 {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) return "";

        int[] need = new int[128];
        for (char c : t.toCharArray()) need[c]++;

        int[] window = new int[128];
        int left = 0, right = 0;
        int required = t.length();
        int formed = 0;
        int minLen = Integer.MAX_VALUE, start = 0;

        while (right < s.length()) {
            char r = s.charAt(right);
            window[r]++;
            if (need[r] > 0 && window[r] <= need[r]) formed++;

            while (formed == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char l = s.charAt(left);
                window[l]--;
                if (need[l] > 0 && window[l] < need[l]) formed--;

                left++;
            }

            right++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
