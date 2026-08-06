// Last updated: 8/6/2026, 6:08:25 PM
1class Solution {
2
3    public int func(int[][] grid, int r, int c, int m, int n, int[][] dp) {
4
5        // Reached destination
6        if (r == m - 1 && c == n - 1) {
7            return grid[r][c];
8        }
9
10        // Already computed
11        if (dp[r][c] != -1) {
12            return dp[r][c];
13        }
14
15        int right = Integer.MAX_VALUE;
16        int down = Integer.MAX_VALUE;
17
18        // Move right
19        if (c + 1 < n) {
20            right = func(grid, r, c + 1, m, n, dp);
21        }
22
23        // Move down
24        if (r + 1 < m) {
25            down = func(grid, r + 1, c, m, n, dp);
26        }
27
28        dp[r][c] = grid[r][c] + Math.min(right, down);
29
30        return dp[r][c];
31    }
32
33    public int minPathSum(int[][] grid) {
34
35        int m = grid.length;
36        int n = grid[0].length;
37
38        int[][] dp = new int[m][n];
39
40        for (int[] row : dp) {
41            Arrays.fill(row, -1);
42        }
43
44        return func(grid, 0, 0, m, n, dp);
45    }
46}