// Last updated: 6/20/2026, 8:51:47 PM
1class Solution {
2    public String[] createGrid(int m, int n) {
3        List<String> ans = new ArrayList<>();
4        for(int i=0;i<m;i++){
5            StringBuilder sb = new StringBuilder();
6            for(int j=0;j<n;j++){
7                if(i==0||j==n-1) sb.append(".");
8                else sb.append('#');
9            }
10            ans.add(sb.toString());
11        }
12        return ans.toArray(new String[0]);
13    }
14}