package com.leetcode.solutions;


import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode ID: 271
 * Title: Encode and Decode Strings
 * Difficulty: Medium
 * Topic: Design, String
 * Link: https://leetcode.com/problems/encode-and-decode-strings/
 * Time Complexity: O(m)
 * Space Complexity: O(m+n)
 */

public class _271_EncodeAndDecodeStrings {
    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String s : strs)
            res.append(s.length()).append('#').append(s);

        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') j++;

            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            res.add(str.substring(i, j));
            i = j;
        }
        return res;
    }
}
