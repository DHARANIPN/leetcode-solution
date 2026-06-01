// Last updated: 6/1/2026, 12:27:54 PM
1class Solution {
2    public int trap(int[] h) {
3        int n = h.length;
4        int left[] = new int[n];
5        int right[] = new int[n];
6        int max = h[0];
7        for(int i=0;i<n;i++){
8            if(max<h[i]) max = h[i];
9                left[i] = max;
10        }
11         int ans = 0;
12         max=h[n-1];
13         for( int i= n-1;i>=0;i--){
14                if(max< h[i])  max = h[i];
15                    right[i] = Math.min(max,left[i]);
16                    ans += Math.abs(right[i]-h[i]);
17         }
18                
19            
20           return ans; 
21        }
22    }
23
24