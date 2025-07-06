package com.leetcode.solutions;


/**
 * LeetCode ID: 695
 * Title: Max Area of Island
 * Difficulty: Medium
 * Topic: Array, DFS, BFS, Union Find, Matrix
 * Link: https://leetcode.com/problems/max-area-of-island/
 * Time Complexity: O(N*M)
 * Space Complexity: O(N*M)
 */

public class _695_MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid){
        if(grid == null || grid.length == 0) return 0;

        int maxArea = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == 1){
                    int islandArea = calculateArea(grid, i, j);
                    maxArea = Math.max(maxArea, islandArea);
                }
            }
        }
        return maxArea;
    }

    private int calculateArea(int[][] grid, int row, int col){
        if(isInvalidCell(grid, row, col)) return 0;

        grid[row][col] = 0;

        int area = 1;

        area += calculateArea(grid, row, col + 1);
        area += calculateArea(grid, row - 1, col);
        area += calculateArea(grid, row, col - 1);
        area += calculateArea(grid, row + 1, col);

        return area;
    }

    private boolean isInvalidCell(int[][] grid, int row, int col){
        return row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] != 1;
    }
}
