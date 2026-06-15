// Last updated: 6/15/2026, 2:56:39 PM
1public class Solution {
2    public void dfs(int[][] M, int[] visited, int i) {
3        for (int j = 0; j < M.length; j++) {
4            if (M[i][j] == 1 && visited[j] == 0) {
5                visited[j] = 1;
6                dfs(M, visited, j);
7            }
8        }
9    }
10    public int findCircleNum(int[][] M) {
11        int[] visited = new int[M.length];
12        int count = 0;
13        for (int i = 0; i < M.length; i++) {
14            if (visited[i] == 0) {
15                dfs(M, visited, i);
16                count++;
17            }
18        }
19        return count;
20    }
21}