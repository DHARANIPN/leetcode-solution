// Last updated: 6/4/2026, 4:14:32 PM
1class Solution {
2    public int tribonacci(int n) {
3        int a = 0,b=1,c=1,d=0;  
4        if(n==0) return 0; 
5        if(n<=2) return 1;
6        for(int i =0;i<n-2;i++){
7            d = a+b;
8            d+=c;
9            a = b;
10            b =c;
11            c =d;
12        }
13        return d;
14    }
15}