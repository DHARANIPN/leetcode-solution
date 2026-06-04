// Last updated: 6/4/2026, 10:48:36 AM
1class Solution {
2    public int maximumUnits(int[][] boxTypes, int truckSize) {
3        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
4        int ans = 0;
5        for(int i =0;i<boxTypes.length;i++){
6            if(boxTypes[i][0]>truckSize){
7                boxTypes[i][0] = Math.min(boxTypes[i][0],truckSize);
8            }
9           ans+=(boxTypes[i][0] * boxTypes[i][1] );
10           truckSize -= boxTypes[i][0];
11        }
12        return ans;
13
14    }
15}
16