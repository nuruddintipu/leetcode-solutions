# 📘 LeetCode Java Solutions

This repository contains Java-based solutions to popular LeetCode problems.

---

<!-- AUTO-GENERATED-START -->

**🧠 Problems Solved:** 25 total

- ✅ Easy: 5
- ⚠️ Medium: 15
- 🔥 Hard: 5

![Difficulty Distribution](https://quickchart.io/chart?c={type:'pie',data:{labels:['Easy','Medium','Hard'],datasets:[{data:[5,15,5],backgroundColor:['#4CAF50','#FFC107','#F44336']}}]}})

**📋 Solution Table:**

| ID | Title | Difficulty | Topic | Solution | Time Complexity | Space Complexity |
|----|--------|------------|--------|----------|-----------------|-----------------|
| [2](https://leetcode.com/problems/add-two-numbers/) | Add Two Numbers | Medium | List, Math, Recursion | [_2_AddTwoNumbers.java](src/com/leetcode/solutions/_2_AddTwoNumbers.java) | O(max(m,n))  | O(max(m, n)
| [3](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Longest Substring Without Repeating Character | Medium | Hash Table, String, Sliding Window | [_3_LongestSubstringWithoutRepeatingChar.java](src/com/leetcode/solutions/_3_LongestSubstringWithoutRepeatingChar.java) | O(n)  | O(min(n, m)) where m is the size of character set
| [19](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | Remove Nth Node From End of List | Medium | Linked List, Two Pointer | [_19_RemoveNthNodeFromEnd.java](src/com/leetcode/solutions/_19_RemoveNthNodeFromEnd.java) | O(n)  | O(1)
| [21](https://leetcode.com/problems/merge-two-sorted-lists/) | Merge Two Sorted Lists | Easy | Linked List, Recursion | [_21_MergeTwoSortedLists.java](src/com/leetcode/solutions/_21_MergeTwoSortedLists.java) | O(n+m)  | O(1)
| [23](https://leetcode.com/problems/merge-k-sorted-lists/) | Merge K Sorted Lists | Hard | Linked List, Divide and Conquer, Heap (Priority queue), Merge Sort | [_23_MergeKSortedLists.java](src/com/leetcode/solutions/_23_MergeKSortedLists.java) | O(nlogk)  | O(1)
| [24](https://leetcode.com/problems/swap-nodes-in-pairs/) | Swap Nodes In Pairs | Medium | Linked List, Recursion | [_24_SwapNodesInPairs.java](src/com/leetcode/solutions/_24_SwapNodesInPairs.java) | O(n)  | O(1)
| [25](https://leetcode.com/problems/reverse-nodes-in-k-group/) | Reverse Nodes in K-Group | Hard | Linked List, Recursion | [_25_ReverseNodesInKGroup.java](src/com/leetcode/solutions/_25_ReverseNodesInKGroup.java) | O(n)  | O(n)
| [30](https://leetcode.com/problems/substring-with-concatenation-of-all-words/) | Substring with Concatenation of All Words | Hard | Hash Table, String, Sliding Window | [_30_SubstringWithConcatenationOfAllWords.java](src/com/leetcode/solutions/_30_SubstringWithConcatenationOfAllWords.java) | O(n * m) where n = s.length(), m = word length  | O(k) where k = number of unique words
| [61](https://leetcode.com/problems/rotate-list/) | Rotate List | Medium | Linked List, Two Pointer | [_61_RotateList.java](src/com/leetcode/solutions/_61_RotateList.java) | O(n)  | O(1)
| [76](https://leetcode.com/problems/minimum-window-substring/) | Minimum Window Substring | Hard | Hash Table, String, Sliding window | [_76_MinWindowSubstring.java](src/com/leetcode/solutions/_76_MinWindowSubstring.java) | O(n+m) where n = s.length(), m = t.length()  | O(m) for character frequency maps
| [92](https://leetcode.com/problems/reverse-linked-list-ii/) | Reverse Linked List II | Medium | Linked List | [_92_ReverseLinkedListII.java](src/com/leetcode/solutions/_92_ReverseLinkedListII.java) | O(n)  | O(1) for iterative approach, O(n) for recursive and stack
| [206](https://leetcode.com/problems/reverse-linked-list/) | Reverse Linked List | Easy | Linked List, Recursion | [_206_ReverseLinkedList.java](src/com/leetcode/solutions/_206_ReverseLinkedList.java) | O(n) for both iterative and recursive approaches  | O(1) if iterative, O(n) if recursive
| [209](https://leetcode.com/problems/minimum-size-subarray-sum/) | Minimum Size Subarray Sum | Medium | Array, Binary Search, Sliding Window, Prefix Sum | [_209_MinSizeSubarraySum.java](src/com/leetcode/solutions/_209_MinSizeSubarraySum.java) | O(n)  | O(1)
| [424](https://leetcode.com/problems/longest-repeating-character-replacement/) | Largest Repeating Character Replacement | Medium | Hash Table, String, Sliding window0 | [_424_LargestRepeatingCharReplacement.java](src/com/leetcode/solutions/_424_LargestRepeatingCharReplacement.java) | O(n)  | O(1)
| [438](https://leetcode.com/problems/find-all-anagrams-in-a-string/) | Find All Anagram in a String | Medium | Hash Table, String, Sliding window | [_438_FindAllAnagramInAString.java](src/com/leetcode/solutions/_438_FindAllAnagramInAString.java) | O(n)  | O(1)
| [567](https://leetcode.com/problems/permutation-in-string/) | Permutation in String | Medium | Hash Table, Two Pointer, String, Sliding Window | [_567_PermutationInString.java](src/com/leetcode/solutions/_567_PermutationInString.java) | O(n) where n = s2.length()  | O(1) - fixed size arrays of 26
| [643](https://leetcode.com/problems/maximum-average-subarray-i/) | Maximum Average Subarray I | Easy | Array, Sliding window | [_643_MaxAvgSubarrayI.java](src/com/leetcode/solutions/_643_MaxAvgSubarrayI.java) | O(n)  | O(1)
| [707](https://leetcode.com/problems/design-linked-list/) | Design Linked List | Medium | Linked List, Design | [_707_DesignLinkedList.java](src/com/leetcode/solutions/_707_DesignLinkedList.java) |   | 
| [992](https://leetcode.com/problems/subarrays-with-k-different-integers/) | Subarrays With K Different Integers | Hard | Array, Hash Table, Sliding Window, Counting | [_992_SubarraysWithKDifferentIntegers.java](src/com/leetcode/solutions/_992_SubarraysWithKDifferentIntegers.java) | O(n) where n = nums.length  | O(k) for the frequency map
| [1004](https://leetcode.com/problems/max-consecutive-ones-iii/) | Maximum Consecutive Ones III | Medium | Array, Binary Search, Sliding Window, Prefix Sum | [_1004_MaxConsecutiveOnesIII.java](src/com/leetcode/solutions/_1004_MaxConsecutiveOnesIII.java) | O(n)  | O(1)
| [1358](https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/) | Number of Substrings Containing All Three Characters | Medium | Hash Table, String, Sliding Window | [_1358_NumOfSubstringContainingAll3Char.java](src/com/leetcode/solutions/_1358_NumOfSubstringContainingAll3Char.java) | O(n) where n = s.length()  | O(1) - fixed size array of 3 elements
| [1456](https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/) | Maximum Number of Vowels in a Substring of Given Length | Medium | String, Sliding window | [_1456_MaxVowelsInSubstringOfGivenLength.java](src/com/leetcode/solutions/_1456_MaxVowelsInSubstringOfGivenLength.java) | O(n)  | O(1)
| [1695](https://leetcode.com/problems/maximum-erasure-value/) | Maximum Erasure Value | Medium | Array, Hash Table, Sliding window | [_1695_MaxErasureValue.java](src/com/leetcode/solutions/_1695_MaxErasureValue.java) | O(n)  | O(k) where k is the number of unique elements in the window
| [2379](https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/) | Minimum Recolors to Get K Consecutive Black Blocks | Easy | String, Sliding Window | [_2379_MinRecolorsToGetKConsecutiveBlackBlocks.java](src/com/leetcode/solutions/_2379_MinRecolorsToGetKConsecutiveBlackBlocks.java) | O(n)  | O(1)
| [3423](https://leetcode.com/problems/maximum-difference-between-adjacent-elements-in-a-circular-array/) | Maximum Difference Between Adjacent Elements in a Circular Array | Easy | Array | [_3423_MaxDiffBetweenAdjacentElementsInCircularArray.java](src/com/leetcode/solutions/_3423_MaxDiffBetweenAdjacentElementsInCircularArray.java) | O(n) where n = nums.length  | O(1) - only using variables for tracking maximum


<!-- AUTO-GENERATED-END -->

---

✅ All solutions follow clean, DRY, and efficient design principles.
