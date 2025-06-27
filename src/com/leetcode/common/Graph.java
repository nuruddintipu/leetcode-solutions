package com.leetcode.common;

import java.util.*;
import java.util.LinkedList;

public class Graph<T> {
    private final Map<T, List<T>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    // Adds a new vertex to the graph
    public void addVertex(T vertex) {
        adjacencyList.putIfAbsent(vertex, new ArrayList<>());
    }

    // Adds an undirected edge between two vertices
    public void addEdge(T vertexA, T vertexB) {
        addVertex(vertexA);
        addVertex(vertexB);

        getNeighbors(vertexA).add(vertexB);
        getNeighbors(vertexB).add(vertexA);
    }

    // Prints the adjacency list representation of the graph
    public void printGraph() {
        for (T vertex : adjacencyList.keySet()) {
            System.out.print(vertex + " -> ");
            System.out.println(getNeighbors(vertex));
        }
    }

    // Breadth-First Search traversal
    public void bfs(T start) {
        Set<T> visited = new HashSet<>();
        Queue<T> queue = new LinkedList<>();

        visited.add(start);
        queue.offer(start);

        System.out.print("BFS traversal of graph starting from " + start + ": ");

        while (!queue.isEmpty()) {
            T current = queue.poll();
            System.out.print(current + " ");

            for (T neighbor : getNeighbors(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }

        System.out.println();
    }

    // Depth-First Search traversal
    public void dfs(T start) {
        Set<T> visited = new HashSet<>();
        System.out.print("DFS traversal of graph starting from " + start + ": ");
        dfsRecursive(start, visited);
        System.out.println();
    }

    // Helper method for DFS recursion
    private void dfsRecursive(T current, Set<T> visited) {
        visited.add(current);
        System.out.print(current + " ");

        for (T neighbor : getNeighbors(current))
            if (!visited.contains(neighbor)) dfsRecursive(neighbor, visited);
    }

    // Returns the adjacency list for a vertex
    private List<T> getNeighbors(T vertex) {
        return adjacencyList.get(vertex);
    }
}
