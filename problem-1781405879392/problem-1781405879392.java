// Last updated: 6/14/2026, 8:27:59 AM
1class Solution {
2    public boolean checkGoodInteger(int n) {
3        int sum = 0;
4        int square = 0;
5        while(n!=0){
6            int s = n%10;
7            sum+=s;
8            square+=(s*s);
9            n/=10;
10        }
11        int d = square - sum;
12        if(d >= 50) return true;
13        else return false;
14        
15    }
16}