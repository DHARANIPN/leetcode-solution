// Last updated: 7/13/2026, 8:53:51 AM
1class Solution {
2    
3    int f(int []nums){
4        int p = nums[0];
5        int c ;
6        int a= Integer.MIN_VALUE;
7        for(int i =1;i<nums.length;i++){
8            c = Math.max(p+nums[i],nums[i-1]+nums[i]);
9            a = Math.max(a,c);
10            p=c;
11        }
12        return a;
13    }
14    public int maxScore(int[][] grid) {
15        int n = grid.length;
16        int m = grid[0].length;
17        
18        int ans= Integer.MIN_VALUE;
19            for(int j=0;j<n;j++){
20                ans= Math.max(ans,f(grid[j]));
21            }
22        //the players may intersect at one point only , so compare all the single elements of grid..
23        for(int i =1 ;i<n-1;i++){
24            for(int j =1;j<m-1;j++){
25                ans=Math.max(ans,grid[i][j]);
26            }
27        }
28        
29        // DO SAME FOR COLUMN : KADANE
30            for(int j=0;j<m;j++){
31               
32                    int []arr = new int [n];
33                 for(int i =0;i<n;i++){
34                    arr[i]= grid[i][j];
35                
36            }
37                ans= Math.max(ans,f(arr));
38        }
39        
40        return ans;
41
42        
43    }
44}