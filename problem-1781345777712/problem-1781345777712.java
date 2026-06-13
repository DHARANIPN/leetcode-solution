// Last updated: 6/13/2026, 3:46:17 PM
1class Solution {
2    int travel(int[][] grid, int r, int c) {
3        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0) {
4            return 0;
5        }
6
7        grid[r][c] = 0;
8
9        return 1+travel(grid, r, c + 1)+travel(grid, r, c - 1)+travel(grid, r - 1, c)+travel(grid, r + 1, c);
10    }
11
12    public int maxAreaOfIsland(int[][] grid) {
13        if (grid == null || grid.length == 0) {
14            return 0;
15        }
16
17        int max = 0;
18        int rows = grid.length;
19        int cols = grid[0].length;
20
21        for (int i = 0; i < rows; i++) {
22            for (int j = 0; j < cols; j++) {
23
24                if (grid[i][j] == 1) {
25                    int s = travel(grid, i, j);
26
27                    max = Math.max(max, s);
28                }
29            }
30        }
31
32        return max;
33    }
34}
35