// Last updated: 6/15/2026, 2:54:10 PM
1class Solution {
2    public int countBattleships(char[][] board) {
3        int c = 0;
4        for(int i =0;i<board.length;i++){
5            for(int j=0;j<board[0].length;j++){
6                if(board[i][j]=='X') {
7                    if((i==0 || board[i-1][j]!='X') && (j==0 || board[i][j-1]!='X')) c++;
8                }
9            }
10        }
11        return c;
12    }
13}