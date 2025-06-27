package com.leetcode.solutions;

/**
 * LeetCode ID: 200
 * Title: Number Of Islands
 * Difficulty: Medium
 * Topic: Array, DFS, BFS, Union Find, Matrix
 * Link: https://leetcode.com/problems/number-of-islands/
 * Time Complexity: O(n*m)
 * Space Complexity: O(n*m)
 */

public class _200_NumberOfIslands {
    public int numIslands(char[][] grid){
        if(grid == null || grid.length == 0) return 0;
        int rows = grid.length;
        int cols = grid[0].length;

        int islandCount = 0;

        for(int row = 0; row < rows; row++)
            for(int col = 0; col < cols; col++){
                if(grid[row][col] == '1'){
                    islandCount++;
                    sinkIsland(grid, row, col);
                }
            }
        return islandCount;
    }

    private void sinkIsland(char[][] grid, int row, int col){
        if(isNotIsland(grid, row, col)) return;

        grid[row][col] = '0';

        sinkIsland(grid, row + 1, col);
        sinkIsland(grid, row - 1, col);
        sinkIsland(grid, row, col + 1);
        sinkIsland(grid, row, col - 1);
    }

    private boolean isNotIsland(char[][] grid, int row, int col){
        return row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == '0';
    }
}
