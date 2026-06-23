// Last updated: 6/23/2026, 7:44:18 PM
1class Solution {
2    public int getLength(int[] a) {
3        int n = a.length;
4        int ans = 1;
5        for (int i = 0; i < n; i++) {
6          HashMap<Integer, Integer> mp = new HashMap<>();
7            int[] fq = new int[n + 1];
8            int mx = 0;
9            int s = 0;
10            for (int j = i; j < n; j++) {
11                int old = mp.getOrDefault(a[j], 0);
12                if (old > 0)
13                    fq[old]--; 
14               mp.put(a[j], old + 1);
15                fq[old + 1]++; 
16                if (old + 1 > mx) {
17                    mx = old + 1;
18                    s = 1; 
19                }
20                else if (old + 1 == mx) {
21                    s++; 
22                }
23                int distinct = mp.size();
24                if (distinct == 1) {
25                    ans = Math.max(ans, j - i + 1);
26                }
27                else if (mx % 2 == 0 &&
28                         s < distinct &&
29                         fq[mx / 2] == distinct - s) {
30
31                    ans = Math.max(ans, j - i + 1);
32                }
33            }
34        }
35        return ans;
36    }
37}