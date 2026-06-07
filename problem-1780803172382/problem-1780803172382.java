// Last updated: 6/7/2026, 9:02:52 AM
1class Solution {
2    public int sumOfGoodIntegers(int n, int k) {
3        int sum = 0;
4        int l = Math.max (1,n-k);
5        int s = n+k;
6        
7        for(int i =l;i<=s;i++){
8            if((n&i)==0){
9                sum +=i;    
10            }
11        }
12        return sum;
13    }
14}