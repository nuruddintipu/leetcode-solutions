package com.leetcode.solutions;

/**
 * LeetCode ID: 733
 * Title: Flood Fill
 * Difficulty: Easy
 * Topic: Array, DFS, BFS, Matrix
 * Link: https://leetcode.com/problems/flood-fill/
 * Time Complexity: O(N) where N is the number of pixel
 * Space Complexity: O(N)
 */

public class _733_FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color){
        int originalColor = image[sr][sc];
        if(originalColor != color)
            dfs(image, sr, sc, originalColor, color);

        return image;
    }

    private void dfs(int[][] image, int row, int col, int originalColor, int color){
        if( row < 0 || row >= image.length ||
            col < 0 || col >= image[0].length ||
                image[row][col] != originalColor){
            return;
        }

        image[row][col] = color;
        dfs(image, row - 1, col, originalColor, color);
        dfs(image, row + 1, col, originalColor, color);
        dfs(image, row, col - 1, originalColor, color);
        dfs(image, row, col + 1, originalColor, color);
    }
}
