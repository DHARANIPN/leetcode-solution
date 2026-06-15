// Last updated: 6/15/2026, 11:20:20 AM
1class Solution {
2    private boolean[][] visit;
3
4    public int[][] colorBorder(int[][] grid, int row, int col, int Color) {
5        int m = grid.length;
6        int n = grid[0].length;
7        visit = new boolean[m][n];
8        
9        int oldColor = grid[row][col];
10        
11        dfs(grid, row, col, oldColor, Color);
12        
13        return grid;
14    }
15
16    public void dfs(int[][] grid, int i, int j, int oldColor, int Color) {
17 
18        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || visit[i][j] || grid[i][j] != oldColor) {
19            return;
20        }
21
22        visit[i][j] = true;
23        int flag = 0;
24
25
26        if (i == 0 || j == 0 || i == grid.length - 1 || j == grid[0].length - 1 || 
27            grid[i - 1][j] != oldColor || grid[i + 1][j] != oldColor || 
28            grid[i][j - 1] != oldColor || grid[i][j + 1] != oldColor) {
29            flag = 1;
30        }
31
32   
33        dfs(grid, i, j + 1, oldColor, Color);
34        dfs(grid, i, j - 1, oldColor, Color);
35        dfs(grid, i - 1, j, oldColor, Color);
36        dfs(grid, i + 1, j, oldColor, Color);
37
38        if (flag == 1) {
39            grid[i][j] = Color;
40        }
41    }
42}