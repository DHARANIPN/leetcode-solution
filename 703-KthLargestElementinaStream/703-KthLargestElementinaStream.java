// Last updated: 6/28/2026, 9:23:06 PM
1class Solution {
2
3    int newColor;
4    int oldColor;
5
6    int[][] dir = {
7        {-1,0},
8        {1,0},
9        {0,-1},
10        {0,1}
11    };
12
13    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
14
15        newColor = color;
16        oldColor = image[sr][sc];
17
18        if(oldColor != newColor){
19            dfs(image, sr, sc);
20        }
21
22        return image;
23    }
24
25
26    public void dfs(int[][] image, int r, int c){
27
28        if(r < 0 || c < 0 ||
29           r >= image.length ||
30           c >= image[0].length ||
31           image[r][c] != oldColor){
32
33            return;
34        }
35
36
37        image[r][c] = newColor;
38
39
40        for(int[] d : dir){
41            dfs(image, r + d[0], c + d[1]);
42        }
43    }
44}