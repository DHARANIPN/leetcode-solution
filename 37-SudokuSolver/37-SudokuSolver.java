// Last updated: 6/13/2026, 11:15:47 AM
1class Solution {
2    private boolean res(char[][] board){
3        for(int r = 0; r < 9; r++){
4            for(int c = 0; c < 9; c++){
5                if(board[r][c] == '.'){
6                    for(char i = '1'; i <= '9'; i++){
7                        if(isValid(board, r, c, i)){
8                            board[r][c] = i; 
9                            
10                            if(res(board)) {
11                                return true; 
12                            } else {
13                                board[r][c] = '.'; // Backtrack
14                            }
15                        }
16                    }
17                    // CRITICAL: This must be OUTSIDE the 'i' loop.
18                    // If we tried '1' through '9' and none worked, 
19                    // this cell cannot be solved in the current state.
20                    return false; 
21                }
22            }
23        }
24        return true; 
25    }
26
27    private boolean isValid(char[][] board, int row, int col, char c) {
28        for (int i = 0; i < 9; i++) {
29            // Check row
30            if (board[row][i] == c) return false; 
31            
32            // Check column
33            if (board[i][col] == c) return false; 
34            
35            // Check 3x3 sub-box
36            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) return false; 
37        }
38        return true; 
39    }
40
41    public void solveSudoku(char[][] board) {
42        res(board); 
43    }
44}