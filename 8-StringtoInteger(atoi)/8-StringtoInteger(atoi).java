// Last updated: 8/6/2026, 6:07:16 PM
1class Solution {
2    public int myAtoi(String s) {
3        if (s == null || s.length() == 0) {
4            return 0;
5        }
6        
7        final int INT_MAX = Integer.MAX_VALUE;
8        final int INT_MIN = Integer.MIN_VALUE;
9        
10        int i = 0;
11        int n = s.length();
12      
13        while (i < n && s.charAt(i) == ' ') {
14            i++;
15        }
16    
17        if (i == n) {
18            return 0;
19        }
20     
21        int sign = 1;
22        if (s.charAt(i) == '+') {
23            i++;
24        } else if (s.charAt(i) == '-') {
25            sign = -1;
26            i++;
27        }
28        
29        long res = 0;
30        while (i < n && Character.isDigit(s.charAt(i))) {
31            int digit = s.charAt(i) - '0';
32            res = res * 10 + digit;
33            
34            if (sign * res <= INT_MIN) {
35                return INT_MIN;
36            }
37            if (sign * res >= INT_MAX) {
38                return INT_MAX;
39            }
40            
41            i++;
42        }
43        
44     
45        return (int)(res * sign);        
46    }
47}