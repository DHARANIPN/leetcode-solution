// Last updated: 6/4/2026, 1:50:49 PM
1class Solution {
2    public int[][] merge(int[][] intervals) {
3     Arrays.sort(intervals,(a,b)->a[0]-b[0]);
4     int k=0;
5     for(int i = 1;i<intervals.length;i++){
6            if(intervals[k][1]>=intervals[i][0]) {
7                intervals[k][1] = Math.max(intervals[i][1],intervals[k][1]);
8            }
9            else{
10                k++;
11                intervals[k]=intervals[i];
12            }
13      }
14      return Arrays.copyOfRange(intervals,0,k+1);
15    }
16}