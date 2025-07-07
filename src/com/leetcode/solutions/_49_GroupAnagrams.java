package com.leetcode.solutions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * LeetCode ID: 49
 * Title: Group Anagram
 * Difficulty: Medium
 * Topic: Array, Hash Table, String, Sorting
 * Link: https://leetcode.com/problems/group-anagrams/
 * Time Complexity: O(n * k)
 * Space Complexity: O(n * k)
 */

public class _49_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramMap = new HashMap<>();

        for(String currentString : strs){
            int[] countOfChars = new int[26];
            for(char c : currentString.toCharArray())
                countOfChars[c-'a']++;

            String mapKey = Arrays.toString(countOfChars);
            anagramMap.putIfAbsent(mapKey, new ArrayList<>());
            anagramMap.get(mapKey).add(currentString);
        }

        return new ArrayList<>(anagramMap.values());
    }
}
