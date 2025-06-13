package com.leetcode.solutions;

import java.util.HashSet;
import java.util.Set;
/**
 * LeetCode ID: 3
 * Title: Longest Substring Without Repeating Character
 * Difficulty: Medium
 * Topic: Hash Table, String, Sliding Window
 * Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Time Complexity: O(n)
 * Space Complexity: O(min(n, m)) where m is the size of character set
 *
 * Approach:
 * Use a variable-size sliding window with two pointers (left and right).
 * Maintain a set or map to track characters in the current window.
 * Expand the window by moving the right pointer and adding characters.
 * When a duplicate character is found, shrink the window from the left until the duplicate is removed.
 * Keep track of the maximum window size encountered during the process.
 * The sliding window ensures we always maintain a substring without repeating characters.
 *
 */


public class _3_LongestSubstringWithoutRepeatingChar {
    public int lengthOfLongestSubstring(String s) {
        if( s == null || s.isEmpty()) return 0;

        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();
        int left = 0, rigth = 0, max = 0;

        while(rigth < chars.length){
            if(!set.contains(chars[rigth])){
                set.add(chars[rigth]);
                rigth++;
                max = Math.max(max, set.size());
            }else{
                set.remove(chars[left]);
                left++;
            }
        }
        return max;
    }
}
