// Last updated: 7/13/2026, 8:55:00 AM
1class Solution {
2     int f(int []nums){
3        int p = nums[0];
4        int c ;
5        int a= Integer.MIN_VALUE;
6        for(int i =1;i<nums.length;i++){
7            c = Math.max(p+nums[i],nums[i-1]+nums[i]);
8            a = Math.max(a,c);
9            p=c;
10        }
11        return a;
12    }
13    public int maxScore(int[][] grid) {
14        int n = grid.length;
15        int m = grid[0].length;
16        
17        int ans= Integer.MIN_VALUE;
18            for(int j=0;j<n;j++){
19                ans= Math.max(ans,f(grid[j]));
20            }
21        //the players may intersect at one point only , so compare all the single elements of grid..
22        for(int i =1 ;i<n-1;i++){
23            for(int j =1;j<m-1;j++){
24                ans=Math.max(ans,grid[i][j]);
25            }
26        }
27        
28        // DO SAME FOR COLUMN : KADANE
29            for(int j=0;j<m;j++){
30               
31                    int []arr = new int [n];
32                 for(int i =0;i<n;i++){
33                    arr[i]= grid[i][j];
34                
35            }
36                ans= Math.max(ans,f(arr));
37        }
38        
39        return ans;
40
41        
42    }
43}