// Last updated: 6/28/2026, 9:28:59 AM
1class Solution {
2    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
3        Arrays.sort(occupiedIntervals, (a, b) -> Integer.compare(a[0], b[0]));
4
5        List<int[]> merged = new ArrayList<>();
6
7        for (int[] interval : occupiedIntervals) {
8            if (merged.isEmpty() || interval[0] > (long) merged.get(merged.size() - 1)[1] + 1) {
9                merged.add(new int[]{interval[0], interval[1]});
10            } else {
11                merged.get(merged.size() - 1)[1] =
12                        Math.max(merged.get(merged.size() - 1)[1], interval[1]);
13            }
14        }
15
16        List<int[]> novalethri = merged;
17
18        List<List<Integer>> ans = new ArrayList<>();
19
20        for (int[] interval : novalethri) {
21            long l = interval[0], r = interval[1];
22
23            if (r < freeStart || l > freeEnd) {
24                ans.add(Arrays.asList((int) l, (int) r));
25            } else {
26                if (l < freeStart) {
27                    ans.add(Arrays.asList((int) l, freeStart - 1));
28                }
29                if (r > freeEnd) {
30                    ans.add(Arrays.asList(freeEnd + 1, (int) r));
31                }
32            }
33        }
34
35        return ans;
36    }
37}