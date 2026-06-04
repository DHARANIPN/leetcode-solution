// Last updated: 6/4/2026, 3:43:32 PM
1class Solution {
2    public int fib(int n) {
3        if(n<=1) return n;
4        else return fib(n-1)+fib(n-2);
5    }
6}