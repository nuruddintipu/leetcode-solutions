# 📘 LeetCode Java Solutions

This repository contains Java-based solutions to popular LeetCode problems.

---

<!-- AUTO-GENERATED-START -->

**🧠 Problems Solved:** 64 total

- ✅ Easy: 15
- ⚠️ Medium: 44
- 🔥 Hard: 5

![Difficulty Distribution](https://quickchart.io/chart?c=%7B%22type%22%3A%20%22pie%22%2C%20%22data%22%3A%20%7B%22labels%22%3A%20%5B%22Easy%22%2C%20%22Medium%22%2C%20%22Hard%22%5D%2C%20%22datasets%22%3A%20%5B%7B%22data%22%3A%20%5B15%2C%2044%2C%205%5D%2C%20%22backgroundColor%22%3A%20%5B%22%234CAF50%22%2C%20%22%23FFC107%22%2C%20%22%23F44336%22%5D%7D%5D%7D%2C%20%22options%22%3A%20%7B%22title%22%3A%20%7B%22display%22%3A%20true%2C%20%22text%22%3A%20%22LeetCode%20Problems%20by%20Difficulty%22%7D%7D%7D)

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
| [82](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/) | Remove Duplicates from Sorted List II | Medium | Linked List, Two Pointers | [_82_RemoveDuplicatesFromSortedListII.java](src/com/leetcode/solutions/_82_RemoveDuplicatesFromSortedListII.java) | O(n)  | O(1)
| [83](https://leetcode.com/problems/remove-duplicates-from-sorted-list/) | Remove Duplicates From Sorted List | Easy | Linked List | [_83_RemoveDuplicatesFromSortedList.java](src/com/leetcode/solutions/_83_RemoveDuplicatesFromSortedList.java) | O(n)  | O(1)
| [86](https://leetcode.com/problems/partition-list/) | Partition List | Medium | Linked List, Two Pointers | [_86_PartitionList.java](src/com/leetcode/solutions/_86_PartitionList.java) | O(n)  | O(1)
| [92](https://leetcode.com/problems/reverse-linked-list-ii/) | Reverse Linked List II | Medium | Linked List | [_92_ReverseLinkedListII.java](src/com/leetcode/solutions/_92_ReverseLinkedListII.java) | O(n)  | O(1) for iterative approach, O(n) for recursive and stack
| [133](https://leetcode.com/problems/clone-graph/) | Clone Graph | Medium | Hash Table, DFS, BFS, Graph | [_133_CloneGraph.java](src/com/leetcode/solutions/_133_CloneGraph.java) | O(V+E)  | O(V)
| [141](https://leetcode.com/problems/linked-list-cycle/) | Linked list Cycle | Easy | Hash Table, Linked List, Two Pointers | [_141_LinkedListCycle.java](src/com/leetcode/solutions/_141_LinkedListCycle.java) | O(n)  | O(1)
| [142](https://leetcode.com/problems/linked-list-cycle-ii/) | Linked List Cycle II | Medium | Hash Table, Linked List, Two Pointers | [_142_LinkedListCycleII.java](src/com/leetcode/solutions/_142_LinkedListCycleII.java) | O(n)  | O(1)
| [143](https://leetcode.com/problems/reorder-list/) | Reorder List | Medium | Linked List, Two Pointers, Stack, Recursion | [_143_ReorderList.java](src/com/leetcode/solutions/_143_ReorderList.java) | O(n)  | O(1)
| [147](https://leetcode.com/problems/insertion-sort-list/) | Insertion Sort List | Medium | Linked List, Sorting | [_147_InsertionSortList.java](src/com/leetcode/solutions/_147_InsertionSortList.java) | O(n^2)  | O(1)
| [148](https://leetcode.com/problems/sort-list/) | Sort List | Medium | Linged List, Merge Sort, Divide and Conquer | [_148_SortList.java](src/com/leetcode/solutions/_148_SortList.java) | O(nlogn)  | O(1) for iterative, O(logn) for recursive
| [160](https://leetcode.com/problems/intersection-of-two-linked-lists/) | Intersection of Two Linked Lists | Easy | Hash Table, Linked List, Two Pointers | [_160_IntersectionOfTwoLinkedLists.java](src/com/leetcode/solutions/_160_IntersectionOfTwoLinkedLists.java) | O(n+m)  | O(1)
| [200](https://leetcode.com/problems/number-of-islands/) | Number Of Islands | Medium | Array, DFS, BFS, Union Find, Matrix | [_200_NumberOfIslands.java](src/com/leetcode/solutions/_200_NumberOfIslands.java) | O(n*m)  | O(n*m)
| [203](https://leetcode.com/problems/remove-linked-list-elements/) | Remove Linked List Elements | Easy | Linked List, Recursion | [_203_RemoveLinkedListElements.java](src/com/leetcode/solutions/_203_RemoveLinkedListElements.java) | O(n)  | O(n) or O(1)
| [206](https://leetcode.com/problems/reverse-linked-list/) | Reverse Linked List | Easy | Linked List, Recursion | [_206_ReverseLinkedList.java](src/com/leetcode/solutions/_206_ReverseLinkedList.java) | O(n) for both iterative and recursive approaches  | O(1) if iterative, O(n) if recursive
| [209](https://leetcode.com/problems/minimum-size-subarray-sum/) | Minimum Size Subarray Sum | Medium | Array, Binary Search, Sliding Window, Prefix Sum | [_209_MinSizeSubarraySum.java](src/com/leetcode/solutions/_209_MinSizeSubarraySum.java) | O(n)  | O(1)
| [234](https://leetcode.com/problems/palindrome-linked-list/) | Palindrome Linked List | Easy | Linked List, Two Pointers, Stack, Recursion | [_234_PalindromeLinkedList.java](src/com/leetcode/solutions/_234_PalindromeLinkedList.java) | O(n)  | O(1)
| [237](https://leetcode.com/problems/delete-node-in-a-linked-list/) | Delete Node in a Linked List | Medium | Linked List | [_237_DeleteNodeInALinkedList.java](src/com/leetcode/solutions/_237_DeleteNodeInALinkedList.java) | O(1)  | O(1)
| [328](https://leetcode.com/problems/odd-even-linked-list/) | Odd Even Linked List | Medium | Linked List | [_328_OddEvenLinkedList.java](src/com/leetcode/solutions/_328_OddEvenLinkedList.java) | O(n)  | O(1)
| [382](https://leetcode.com/problems/linked-list-random-node/) | Linked List Random Node | Medium | Linked List, Math, Reservoir Sampling, Randomized | [_382_LinkedListRandomNode.java](src/com/leetcode/solutions/_382_LinkedListRandomNode.java) | O(n)  | O(1)
| [424](https://leetcode.com/problems/longest-repeating-character-replacement/) | Largest Repeating Character Replacement | Medium | Hash Table, String, Sliding window0 | [_424_LargestRepeatingCharReplacement.java](src/com/leetcode/solutions/_424_LargestRepeatingCharReplacement.java) | O(n)  | O(1)
| [430](https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/) | Flatten A Multilevel Doubly Linked List | Medium | Linked List, DFS, DLL | [_430_FlattenAMultilevelDoublyLinkedList.java](src/com/leetcode/solutions/_430_FlattenAMultilevelDoublyLinkedList.java) | O(n)  | O(n)
| [438](https://leetcode.com/problems/find-all-anagrams-in-a-string/) | Find All Anagram in a String | Medium | Hash Table, String, Sliding window | [_438_FindAllAnagramInAString.java](src/com/leetcode/solutions/_438_FindAllAnagramInAString.java) | O(n)  | O(1)
| [567](https://leetcode.com/problems/permutation-in-string/) | Permutation in String | Medium | Hash Table, Two Pointer, String, Sliding Window | [_567_PermutationInString.java](src/com/leetcode/solutions/_567_PermutationInString.java) | O(n) where n = s2.length()  | O(1) - fixed size arrays of 26
| [622](https://leetcode.com/problems/design-circular-queue/) | Design Circular Queue | Medium | Array, Linked List, Design, Queue | [_622_DesignCircularQueue.java](src/com/leetcode/solutions/_622_DesignCircularQueue.java) | O(1)  | O(n)
| [641](https://leetcode.com/problems/design-circular-deque/) | Design Circular Deque | Medium | Array, Linked List, Design, Queue | [_641_DesignCircularDeque.java](src/com/leetcode/solutions/_641_DesignCircularDeque.java) | O(1)  | O(n)
| [643](https://leetcode.com/problems/maximum-average-subarray-i/) | Maximum Average Subarray I | Easy | Array, Sliding window | [_643_MaxAvgSubarrayI.java](src/com/leetcode/solutions/_643_MaxAvgSubarrayI.java) | O(n)  | O(1)
| [705](https://leetcode.com/problems/design-hashset/) | Design HashSet | Easy | Array, Hash Table, Linked List, Design, Hash Function | [_705_DesignHashSet.java](src/com/leetcode/solutions/_705_DesignHashSet.java) | O(1) avg, O(n) worst  | O(n+m)
| [706](https://leetcode.com/problems/design-hashmap/) | Design HashMap | Easy | Array, Linked List, Hash Table, Design, Hash Function | [_706_DesignHashMap.java](src/com/leetcode/solutions/_706_DesignHashMap.java) | O(1) or O(n)  | O(n)
| [707](https://leetcode.com/problems/design-linked-list/) | Design Linked List | Medium | Linked List, Design | [_707_DesignLinkedList.java](src/com/leetcode/solutions/_707_DesignLinkedList.java) |   | 
| [725](https://leetcode.com/problems/split-linked-list-in-parts/) | Split Linked List in Parts | Medium | Linked List | [_725_SplitLinkedListInParts.java](src/com/leetcode/solutions/_725_SplitLinkedListInParts.java) | O(n)  | O(k)
| [733](https://leetcode.com/problems/flood-fill/) | Flood Fill | Easy | Array, DFS, BFS, Matrix | [_733_FloodFill.java](src/com/leetcode/solutions/_733_FloodFill.java) | O(N) where N is the number of pixel  | O(N)
| [817](https://leetcode.com/problems/linked-list-components/) | Linked List Components | Medium | Array, Hash Table, Linked List | [_817_LinkedListComponents.java](src/com/leetcode/solutions/_817_LinkedListComponents.java) | O(n)  | O(G)
| [876](https://leetcode.com/problems/middle-of-the-linked-list/) | Middle Of The Linked List | Easy | Linked List, Two Pointers | [_876_MiddleOfTheLinkedList.java](src/com/leetcode/solutions/_876_MiddleOfTheLinkedList.java) | O(n)  | O(1)
| [992](https://leetcode.com/problems/subarrays-with-k-different-integers/) | Subarrays With K Different Integers | Hard | Array, Hash Table, Sliding Window, Counting | [_992_SubarraysWithKDifferentIntegers.java](src/com/leetcode/solutions/_992_SubarraysWithKDifferentIntegers.java) | O(n) where n = nums.length  | O(k) for the frequency map
| [1004](https://leetcode.com/problems/max-consecutive-ones-iii/) | Maximum Consecutive Ones III | Medium | Array, Binary Search, Sliding Window, Prefix Sum | [_1004_MaxConsecutiveOnesIII.java](src/com/leetcode/solutions/_1004_MaxConsecutiveOnesIII.java) | O(n)  | O(1)
| [1171](https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/) | Remove Zero Sum Consecutive Nodes from Linked List | Medium | Hash Table, Linked List | [_1171_RemoveZeroSumConsecutiveNodes.java](src/com/leetcode/solutions/_1171_RemoveZeroSumConsecutiveNodes.java) | O(n)  | O(n)
| [1290](https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/) | Convert Binary Number In a Linked List to Integer | Easy | Linked List, Math | [_1209_ConvertBinaryNumberInALinkedListToInteger.java](src/com/leetcode/solutions/_1209_ConvertBinaryNumberInALinkedListToInteger.java) | O(n)  | O(1)
| [1358](https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/) | Number of Substrings Containing All Three Characters | Medium | Hash Table, String, Sliding Window | [_1358_NumOfSubstringContainingAll3Char.java](src/com/leetcode/solutions/_1358_NumOfSubstringContainingAll3Char.java) | O(n) where n = s.length()  | O(1) - fixed size array of 3 elements
| [1367](https://leetcode.com/problems/linked-list-in-binary-tree/) | Linked List In Binary Tree | Medium | Linked List, Tree, Binary Tree, Depth-first Search | [_1367_LinkedListInBinaryTree.java](src/com/leetcode/solutions/_1367_LinkedListInBinaryTree.java) | O(N*M)  | O(H)
| [1456](https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/) | Maximum Number of Vowels in a Substring of Given Length | Medium | String, Sliding window | [_1456_MaxVowelsInSubstringOfGivenLength.java](src/com/leetcode/solutions/_1456_MaxVowelsInSubstringOfGivenLength.java) | O(n)  | O(1)
| [1472](https://leetcode.com/problems/design-browser-history/) | Design Browser History | Medium | Array, Linked List, Stack, Design, Doubly-Linked List, Data Stream | [_1472_DesignBrowserHistory.java](src/com/leetcode/solutions/_1472_DesignBrowserHistory.java) | O(1)  | O(n)
| [1669](https://leetcode.com/problems/merge-in-between-linked-lists/) | Merge In Between Linked Lists | Medium | Linkd List | [_1669_MergeInBetweenLinkedLists.java](src/com/leetcode/solutions/_1669_MergeInBetweenLinkedLists.java) | O(n)  | O(1)
| [1670](https://leetcode.com/problems/design-front-middle-back-queue/) | Design Front Middle Back Queue | Medium | Array, Linked List, Design, Queue, Data Stream | [_1670_DesignFrontMiddleBackQueue.java](src/com/leetcode/solutions/_1670_DesignFrontMiddleBackQueue.java) | O(1)  | O(n)
| [1695](https://leetcode.com/problems/maximum-erasure-value/) | Maximum Erasure Value | Medium | Array, Hash Table, Sliding window | [_1695_MaxErasureValue.java](src/com/leetcode/solutions/_1695_MaxErasureValue.java) | O(n)  | O(k) where k is the number of unique elements in the window
| [1721](https://leetcode.com/problems/swapping-nodes-in-a-linked-list/) | Swapping Nodes In a Linked List | Medium | Linked List, Two Pointers | [_1721_SwappingNodesInALinkedList.java](src/com/leetcode/solutions/_1721_SwappingNodesInALinkedList.java) | O(n)  | O(1)
| [2095](https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/) | Delete the Middle Node Of A Linked List | Medium | Linked List, Two Pointers | [_2095_DeleteTheMiddleNodeOfALinkedList.java](src/com/leetcode/solutions/_2095_DeleteTheMiddleNodeOfALinkedList.java) | O(n)  | O(1)
| [2130](https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/) | Maximum Twin Sum Of A Linked List | Medium | Linked List, Two Pointers, Stack | [_2130_MaximumTwinSumOfALinkedList.java](src/com/leetcode/solutions/_2130_MaximumTwinSumOfALinkedList.java) | O(n)  | O(1)
| [2181](https://leetcode.com/problems/merge-nodes-in-between-zeros/) | Merge Nodes In Between Zeros | Medium | Linked List, Simulation | [_2181_MergeNodesInBetweenZeros.java](src/com/leetcode/solutions/_2181_MergeNodesInBetweenZeros.java) | O(n)  | O(1)
| [2379](https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/) | Minimum Recolors to Get K Consecutive Black Blocks | Easy | String, Sliding Window | [_2379_MinRecolorsToGetKConsecutiveBlackBlocks.java](src/com/leetcode/solutions/_2379_MinRecolorsToGetKConsecutiveBlackBlocks.java) | O(n)  | O(1)
| [2487](https://leetcode.com/problems/remove-nodes-from-linked-list/) | Remove Nodes From Linked List | Medium | Linked List, Stack, Recursion, Monotonic Stack | [_2487_RemoveNodesFromLinkedList.java](src/com/leetcode/solutions/_2487_RemoveNodesFromLinkedList.java) | O(n)  | O(1)
| [2807](https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/) | Insert Greatest Common Divisor In Linked List | Medium | Linked List, Math, Number Theory | [_2807_InsertGreatestCommonDivisorsInLinkedList.java](src/com/leetcode/solutions/_2807_InsertGreatestCommonDivisorsInLinkedList.java) | O(n)  | O(1)
| [2816](https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/) | Double A Number Represented A Linked List | Medium | Linked List, Math, Stack | [_2816_DoubleANumberRepresentedAsALinkedList.java](src/com/leetcode/solutions/_2816_DoubleANumberRepresentedAsALinkedList.java) | O(n)  | O(1)
| [3217](https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/) | Delete Nodes From Linked List Present In Array | Medium | Array, Hash Table, Linked List | [_3217_DeleteNodesFromLinkedListPresentInArray.java](src/com/leetcode/solutions/_3217_DeleteNodesFromLinkedListPresentInArray.java) | O(n+m)  | O(m)
| [3423](https://leetcode.com/problems/maximum-difference-between-adjacent-elements-in-a-circular-array/) | Maximum Difference Between Adjacent Elements in a Circular Array | Easy | Array | [_3423_MaxDiffBetweenAdjacentElementsInCircularArray.java](src/com/leetcode/solutions/_3423_MaxDiffBetweenAdjacentElementsInCircularArray.java) | O(n) where n = nums.length  | O(1) - only using variables for tracking maximum


<!-- AUTO-GENERATED-END -->

---

✅ All solutions follow clean, DRY, and efficient design principles.
