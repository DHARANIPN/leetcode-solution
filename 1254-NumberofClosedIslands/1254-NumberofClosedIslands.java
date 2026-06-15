// Last updated: 6/15/2026, 12:10:26 PM
1class Solution {
2    public void dfs(int[][] grid, int r, int c) {
3        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 1) {
4            return;
5        }
6        grid[r][c] = 1;
7        dfs(grid, r + 1, c);
8        dfs(grid, r - 1, c);
9        dfs(grid, r, c + 1);
10        dfs(grid, r, c - 1);
11    }
12    public int closedIsland(int[][] grid) {
13        int m = grid.length;
14        int n = grid[0].length;
15        for(int i = 0;i<n;i++){  //row
16            dfs(grid,0,i);
17            dfs(grid,m-1,i);
18        }
19        for(int j = 0;j<m;j++){ //col
20            dfs(grid,j,0);
21            dfs(grid,j,n-1);
22        }
23        int c = 0;
24        for(int i =0;i<m;i++){
25            for(int j =1;j<n;j++){
26                if(grid[i][j]==0) c++;
27                dfs(grid,i,j);
28            }
29        }
30        return c;
31        }
32}