package com.leetcode.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode ID: 30
 * Title: Substring with Concatenation of All Words
 * Difficulty: Hard
 * Topic: Hash Table, String, Sliding Window
 * Link: https://leetcode.com/problems/substring-with-concatenation-of-all-words/
 * Time Complexity: O(n * m) where n = s.length(), m = word length
 * Space Complexity: O(k) where k = number of unique words
 *
 * Approach:
 * Use multiple sliding windows, one for each possible starting offset (0 to wordLength-1).
 * For each offset, slide a window that moves in word-length chunks, not single characters.
 * Maintain frequency maps: 'wordMap' for target words, 'windowMap' for the current window.
 * Track 'matchCount' to know when a window contains all required words.
 *
 * For each word-sized chunk:
 * - If a word is in target: add to window, expand if needed by shrinking from left
 * - If a word is not in targets: reset a window completely (start fresh from current position)
 * - When matchCount equals total words needed, record the starting index
 *
 * Key insight: We need exact concatenation, so we slide by word lengths and handle
 * multiple starting offsets to cover all possible valid starting positions.
 *
 */


public class _30_SubstringWithConcatenationOfAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> indices = new ArrayList<>();
        if(isInvalidInput(s, words)) return indices;

        int wordLength = words[0].length();
        int wordCount = words.length;

        if(isImpossibleSolution(s, words)) return indices;

        Map<String, Integer> wordMap = buildWordsFrequencyMap(words);

        for(int offset = 0; offset < wordLength; offset++){
            int leftPointer = offset, rightPointer = offset, matchCount = 0;
            Map<String, Integer> windowMap = new HashMap<>();

            while(rightPointer + wordLength <= s.length()){
                String currentWord = s.substring(rightPointer, rightPointer+wordLength);
                rightPointer += wordLength;

                if(wordMap.containsKey(currentWord)){
                    windowMap.put(currentWord, windowMap.getOrDefault(currentWord, 0) + 1);
                    matchCount++;

                    while(windowMap.get(currentWord) > wordMap.get(currentWord)){
                        String removedWord = s.substring(leftPointer, leftPointer+wordLength);
                        windowMap.put(removedWord, windowMap.get(removedWord) - 1);
                        leftPointer += wordLength;
                        matchCount--;
                    }
                    if(matchCount == wordCount) indices.add(leftPointer);
                } else{
                    windowMap.clear();
                    leftPointer = rightPointer;
                    matchCount = 0;
                }
            }
        }
        return indices;
    }
    private Map<String, Integer> buildWordsFrequencyMap(String[] words){
        Map<String, Integer> wordMap = new HashMap<>();
        for(String word : words) wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);

        return wordMap;
    }

    private boolean isInvalidInput(String s, String[] words){
        return s == null || s.isEmpty() || words == null || words.length == 0;
    }

    private boolean isImpossibleSolution(String s, String[] words){
        int windowSize = words[0].length() * words.length;
        return s.length() < windowSize;
    }
}
