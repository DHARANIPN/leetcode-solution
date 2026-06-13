// Last updated: 6/13/2026, 3:19:14 PM
1class Solution {
2    int travel(int[][] grid, int r, int c) {
3        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0) {
4            return 0;
5        }
6     
7        grid[r][c] = 0;
8        
9      
10        int a = 1;
11        a += travel(grid, r, c + 1); 
12        a += travel(grid, r, c - 1); 
13        a += travel(grid, r - 1, c); 
14        a += travel(grid, r + 1, c); 
15        
16        return a;
17    }
18
19    public int maxAreaOfIsland(int[][] grid) {
20        if (grid == null || grid.length == 0) {
21            return 0;
22        }
23
24        int max = 0;
25        int rows = grid.length;
26        int cols = grid[0].length;
27
28        for (int i = 0; i < rows; i++) {
29            for (int j = 0; j < cols; j++) {
30
31                if (grid[i][j] == 1) {
32                    int s = travel(grid, i, j);
33                  
34                    max = Math.max(max, s);
35                }
36            }
37        }
38        
39        return max;
40    }
41}
42    