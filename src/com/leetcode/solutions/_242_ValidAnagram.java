package com.leetcode.solutions;


/**
 * LeetCode ID: 242
 * Title: Valid Anagram
 * Difficulty: Easy
 * Topic: Hash Table, String, Sorting
 * Link: https://leetcode.com/problems/valid-anagram
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;


        int[] charCounts = new int[26];
        for(int i = 0; i < s.length(); i++){
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        for(int charCount : charCounts)
            if(charCount != 0) return false;

        return true;
    }
}
