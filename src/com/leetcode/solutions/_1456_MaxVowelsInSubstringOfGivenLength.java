package com.leetcode.solutions;

/**
 * LeetCode ID: 1456
 * Title: Maximum Number of Vowels in a Substring of Given Length
 * Difficulty: Medium
 * Topic: String, Sliding window
 * Link: https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * Use a fixed-size sliding window of length k.
 * Pre-compute vowel lookup using a boolean array for O(1) vowel checking.
 * Count vowels in the first k characters as the initial window.
 * Slide the window by removing the leftmost character and adding the rightmost character.
 * For each slide: decrement count if removed character is vowel, increment if added character is vowel.
 * Keep track of the maximum vowel count found across all windows.
 * Since window size is constant, we only need to track the count, not positions.
 *
 */


public class _1456_MaxVowelsInSubstringOfGivenLength {
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
