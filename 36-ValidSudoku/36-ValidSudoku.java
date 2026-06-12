// Last updated: 6/12/2026, 9:43:34 PM
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3        HashSet<Character>[] r = new HashSet[9];
4        HashSet<Character>[] c = new HashSet[9];
5        HashSet<Character>[] b = new HashSet[9];
6        
7        for (int i = 0; i < 9; i++) {
8            r[i] = new HashSet<>();
9            c[i] = new HashSet<>();
10            b[i] = new HashSet<>();
11        }
12         for (int i = 0; i < 9; i++) {
13            for (int j = 0; j < 9; j++) {
14                if (board[i][j] == '.') {
15                    continue;
16                }
17                char v = board[i][j];
18                int m = (i / 3) * 3 + (j / 3);
19                if(r[i].contains(v) || c[j].contains(v) || b[m].contains(v)){
20                    return false;
21                }
22                r[i].add(v);
23                c[j].add(v);
24                b[m].add(v);
25            }
26         }
27         return true;
28    }
29}