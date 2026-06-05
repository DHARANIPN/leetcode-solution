// Last updated: 6/5/2026, 10:25:05 AM
1class Solution {
2    public int rob(int[] nums) {
3        int a = 0,b=0,m=0;
4        for(int i : nums){
5            m = Math.max(a,b+i);
6            b=a;
7            a = m;
8        }
9        return m;
10    }
11}