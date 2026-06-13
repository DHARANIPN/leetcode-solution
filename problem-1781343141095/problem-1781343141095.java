// Last updated: 6/13/2026, 3:02:21 PM
1class Solution {
2    void travel(char[][] grid,int r,int c){
3        if(c>=grid[0].length || c<0 || r<0 || r>=grid.length || grid[r][c] == '0') return ;
4        grid[r][c] ='0';
5    travel(grid,r,c+1);
6    travel(grid,r,c-1);
7    travel(grid,r-1,c);
8    travel(grid,r+1,c);
9
10    }
11    public int numIslands(char[][] grid) {
12        int x =0;int r=grid.length;int c =grid[0].length;
13        for(int i =0;i<r;i++){
14            for(int j=0;j<c;j++){
15                if(grid[i][j] =='1'){
16                    x++;
17                    travel(grid,i,j);
18                }
19            }
20        }
21        return x;
22    }
23}