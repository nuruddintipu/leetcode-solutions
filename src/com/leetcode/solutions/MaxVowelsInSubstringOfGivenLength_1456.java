package com.leetcode.solutions;

/**
 * LeetCode ID: 1456
 * Title: Maximum Number of Vowels in a Substring of Given Length
 * Difficulty: Medium
 * Topic: String, Sliding window
 * Link: https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class MaxVowelsInSubstringOfGivenLength_1456 {
    public int maxVowels(String s, int k) {
        boolean[] isVowel = new boolean[26];
        isVowel[0] = isVowel['e'-'a'] = isVowel['i'-'a'] = isVowel['o'-'a'] = isVowel['u'-'a'] = true;

        int vowelsCount = 0;
        for(int i = 0; i < k; i++) if(isVowel[s.charAt(i) - 'a']) vowelsCount++;
        int maxVowelsCount = vowelsCount;

        for(int i = k; i < s.length(); i++){
            if(isVowel[s.charAt(i-k)-'a']) vowelsCount--;
            if(isVowel[s.charAt(i)-'a']) vowelsCount++;

            maxVowelsCount = Math.max(vowelsCount, maxVowelsCount);
        }

        return maxVowelsCount;
    }
}
