// Last updated: 6/4/2026, 3:55:16 PM
1class Solution {
2    public int climbStairs(int n) {
3      int a =1,b=1,c=0;
4      if(n<=2) return n;
5      for(int i =0;i<n-1;i++){
6        c = a+b;
7        a=b;
8        b=c;
9      }
10      return c;
11    }
12}
13        