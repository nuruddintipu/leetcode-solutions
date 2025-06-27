package com.leetcode.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode ID: 133
 * Title: Clone Graph
 * Difficulty: Medium
 * Topic: Hash Table, DFS, BFS, Graph
 * Link: https://leetcode.com/problems/clone-graph/
 * Time Complexity: O(V+E)
 * Space Complexity: O(V)
 */

public class _133_CloneGraph {
    private class Node{
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    private final Map<Node, Node> clonedMap = new HashMap<>();

    public Node cloneGraph(Node node){
        if(node == null) return null;

        if(clonedMap.containsKey(node)) return clonedMap.get(node);

        Node clone = new Node(node.val);
        clonedMap.put(node, clone);

        for(Node neighbor : node.neighbors){
            Node clonedNeighbor = cloneGraph(neighbor);
            clone.neighbors.add(clonedNeighbor);
        }
        return clone;
    }
}
