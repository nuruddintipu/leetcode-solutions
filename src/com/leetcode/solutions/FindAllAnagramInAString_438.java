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
 */

public class FindAllAnagramInAString_438 {
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

