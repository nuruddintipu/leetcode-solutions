package com.leetcode.solutions;


/**
 * LeetCode ID: 463
 * Title: Islan Perimeter
 * Difficulty: Easy
 * Topic: Array, BFS, DFS, Matrix
 * Link: https://leetcode.com/problems/island-perimeter/
 * Time Complexity: O(N*M)
 * Space Complexity: O(N*M)
 */

public class _463_IslanPerimeter {
    public int islandPerimeter(int[][] grid){
        int rows = grid.length;
        int cols = grid[0].length;

        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                if(grid[row][col] == 1){
                    return dfs(grid, row, col);
                }
            }
        }

        return 0;
    }

    private int dfs(int[][] grid, int row, int col){
        if(isInvalid(grid, row, col)) return 1;

        if(grid[row][col] == -1) return 0;

        grid[row][col] = -1;

        int perimeter = 0;

        perimeter += dfs(grid, row + 1, col);
        perimeter += dfs(grid, row, col + 1);
        perimeter += dfs(grid, row - 1, col);
        perimeter += dfs(grid, row, col - 1);

        return perimeter;
    }

    private boolean isInvalid(int[][] grid, int row, int col){
        return row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == 0;
    }
}
