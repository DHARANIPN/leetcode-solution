// Last updated: 7/31/2026, 8:26:41 AM
1class Solution {
2
3    public void rotate(int[][] matrix) {
4
5        int n = matrix.length;
6        int[][] ans = new int[n][n];
7
8        // Build rotated matrix
9        for (int i = 0; i < n; i++) {
10            for (int j = 0; j < n; j++) {
11                ans[j][n - 1 - i] = matrix[i][j];
12            }
13        }
14
15        // Copy back
16        for (int i = 0; i < n; i++) {
17            for (int j = 0; j < n; j++) {
18                matrix[i][j] = ans[i][j];
19            }
20        }
21    }
22}