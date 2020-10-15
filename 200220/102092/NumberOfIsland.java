/*
https://leetcode.com/problems/number-of-islands/submissions/
*/

class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    BFS(grid, i, j);
                }
            }
        }
        return count;
    }

    private void BFS(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';

        BFS(grid, i - 1, j);
        BFS(grid, i + 1, j);
        BFS(grid, i, j - 1);
        BFS(grid, i, j + 1);
    }
}