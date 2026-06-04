// Last updated: 6/4/2026, 11:25:59 AM
1class Solution {
2    public int maximumUnits(int[][] boxTypes, int truckSize) {
3        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
4        // int ans = 0;
5        // for(int i =0;i<boxTypes.length;i++){
6        //     if(boxTypes[i][0]>truckSize){
7        //         boxTypes[i][0] = Math.min(boxTypes[i][0],truckSize);
8        //     }
9        //    ans+=(boxTypes[i][0] * boxTypes[i][1] );
10        //    truckSize -= boxTypes[i][0];
11        // }
12        // return ans;
13        int ans = 0,i =0,n = boxTypes.length;
14        while(i<n && truckSize > 0){
15            int box = Math.min(boxTypes[i][0],truckSize);
16            ans+=(box * boxTypes[i][1] );
17            i++;
18            truckSize -= box;
19        }
20        return ans;
21    }
22}
23