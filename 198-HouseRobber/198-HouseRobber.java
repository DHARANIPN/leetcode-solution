// Last updated: 6/5/2026, 3:03:29 PM
1class Solution {
2    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
3    int [][] dp = new int[startTime.length][3];
4    for(int i =0;i<startTime.length;i++){
5        dp[i][0] = startTime[i];
6        dp[i][1] = endTime[i];
7        dp[i][2] =profit[i];
8    }
9    Arrays.sort(dp,(a,b)->a[0]-b[0]);
10     Arrays.sort(startTime);
11     int n = startTime.length;
12     int[] arr = new int[n+1];
13     arr[n] = 0;
14     for(int i = n-1;i>=0;i--){
15        int cp = dp[i][2];
16        int end = dp[i][1];
17        int ind = -1;
18        int after = 0;
19        for(int k= i+1;k<n;k++){
20        if(end<=dp[k][0] ){
21             ind = k;
22            break;
23         }
24        }
25         if(ind != -1){
26            after = arr[ind];
27         }
28            int total = cp+after;
29            arr[i]=Math.max(total,arr[i+1]);
30         
31     }   
32    
33     return arr[0];
34   }
35}