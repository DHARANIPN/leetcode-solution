// Last updated: 6/4/2026, 12:09:42 PM
1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        int n = intervals.length;
4        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
5        int end =Integer.MIN_VALUE,ans = 0;
6        for(int[] i : intervals){
7            if(end>i[0]) ans++;
8            else end = i[1];
9        }
10        return ans;
11    }
12}