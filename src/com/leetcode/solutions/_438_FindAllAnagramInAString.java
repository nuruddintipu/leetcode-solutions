package com.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode ID: 438
 * Title: Find All Anagram in a String
 * Difficulty: Medium
 * Topic: Hash Table, String, Sliding window
 * Link: https://leetcode.com/problems/find-all-anagrams-in-a-string/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * Use a fixed-size sliding window of length equal to the pattern string.
 * Maintain frequency counts of characters in both the pattern and current window.
 * Slide the window through the string one character at a time.
 * For each position, add the new character and remove the character that's sliding out.
 * Compare the frequency maps - if they match, we found an anagram starting at current position.
 * Use array of size 26 for frequency counting since we only deal with lowercase letters.
 *
 */


public class _438_FindAllAnagramInAString {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length() < p.length()) return new ArrayList<>();
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for (int i = 0; i < p.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            pCount[p.charAt(i) - 'a']++;
        }
        List<Integer> result = new ArrayList<>();
        if(matches(sCount, pCount)) result.add(0);
        for (int i = p.length(); i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            sCount[s.charAt(i - p.length()) - 'a']--;
            if(matches(sCount, pCount)) result.add(i - p.length() + 1);
        }

        return result;
    }
    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}

