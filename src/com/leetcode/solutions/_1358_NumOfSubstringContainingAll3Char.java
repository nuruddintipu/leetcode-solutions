package com.leetcode.solutions;

/**
 * LeetCode ID: 1358
 * Title: Number of Substrings Containing All Three Characters
 * Difficulty: Medium
 * Topic: Hash Table, String, Sliding Window
 * Link: https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/
 * Time Complexity: O(n) where n = s.length()
 * Space Complexity: O(1) - fixed size array of 3 elements
 *
 * Approach:
 * Use sliding window technique to find the minimum valid window containing all three characters.
 * Once we find a valid window (containing at least one 'a', 'b', and 'c'),
 * all substrings starting from current left pointer and extending to or beyond
 * current right pointer are valid.
 *
 * For each valid window starting at leftPointer and ending at rightPointer:
 * - Count of valid substrings = (s.length() - rightPointer)
 * - This represents all substrings from leftPointer to any position from rightPointer to end
 *
 * Contract the window by moving leftPointer until window becomes invalid,
 * then continue expanding with rightPointer.
 *
 * Key insight: Once we have a valid substring, extending it to the right
 * keeps it valid, so we can count all such extensions at once.
 *
 */


public class _1358_NumOfSubstringContainingAll3Char {
    public int numberOfSubstrings(String s){
        int leftPointer = 0;
        int result = 0;
        int[] substringCount = new int[3];

        for(int rightPointer = 0; rightPointer < s.length(); rightPointer++){
            substringCount[s.charAt(rightPointer)-'a']++;
            while(substringCount[0] > 0 && substringCount[1] > 0 && substringCount[2] > 0){
                result += s.length() - rightPointer;
                substringCount[s.charAt(leftPointer) - 'a']--;
                leftPointer++;
            }
        }

        return result;
    }
}
