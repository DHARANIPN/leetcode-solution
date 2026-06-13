// Last updated: 6/13/2026, 11:21:05 AM
1class Solution {
2    // 1. YOUR HELPER FUNCTION (Fixed & Closed properly)
3    public boolean check(char[][] board, int row, int col) {
4        // Check Row and Column for duplicates
5        for (int i = 0; i < 9; i++) {
6            if (i != col && board[row][col] == board[row][i]) {
7                return false;
8            }
9            if (i != row && board[row][col] == board[i][col]) {
10                return false;
11            }
12        }
13
14        // Check the 3x3 Sub-box for duplicates
15        int r = (row / 3) * 3;
16        int c = (col / 3) * 3;
17        
18        // FIX 1: Change '<=' to '<' so it stops at index 8 and doesn't crash on index 9
19        for (int i = r; i < r + 3; i++) {
20            for (int j = c; j < c + 3; j++) {
21                // FIX 2: Use || instead of && so we only skip the target cell itself
22                if (i != row || j != col) { 
23                    // FIX 3: Compare against the actual target cell value, not board[r][c]
24                    if (board[i][j] == board[row][col]) {
25                        return false;
26                    }
27                }
28            }
29        }
30        return true;
31    } // <-- This closing brace safely closes the check function!
32
33    // 2. THE MAIN METHOD (Now properly placed outside the check function)
34    public boolean isValidSudoku(char[][] board) {
35        for (int i = 0; i < 9; i++) {
36            for (int j = 0; j < 9; j++) {
37                if (board[i][j] != '.') {
38                    if (!check(board, i, j)) {
39                        return false;
40                    }
41                }
42            }
43        }
44        return true;
45    }
46}