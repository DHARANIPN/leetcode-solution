// Last updated: 6/15/2026, 3:29:48 PM
1class Solution {
2    public void solve(char[][] board) {
3        int r=board.length;
4        int c=board[0].length;
5        for(int i=0;i<r;i++){
6            for(int j=0;j<c;j++){
7                if((j==0||i==0||i==r-1||j==c-1)&&board[i][j]=='O') 
8                    dfs(board,i,j);
9            }
10        }
11        for(int i=0;i<r;i++){
12            for(int j=0;j<c;j++){
13                if(board[i][j]=='O') board[i][j]='X';  
14            }
15        }
16        for(int i=0;i<r;i++){
17            for(int j=0;j<c;j++){
18                if(board[i][j]=='#') board[i][j]='O';  
19            }
20        }
21    }
22    public void dfs(char[][] board,int i,int j){
23
24        if(i<0||j<0||i>=board.length||j>=board[0].length||board[i][j]=='X'|| board[i][j] == '#')   
25            return;
26        board[i][j]='#';
27        dfs(board,i-1,j);
28        dfs(board,i+1,j);
29        dfs(board,i,j-1);
30        dfs(board,i,j+1);
31
32    }
33}