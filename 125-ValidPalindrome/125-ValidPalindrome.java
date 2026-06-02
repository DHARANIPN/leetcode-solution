// Last updated: 6/2/2026, 9:17:28 PM
1class Solution {
2    public int mySqrt(int x) {
3        if (x < 2) {
4            return x;
5        }
6        int low = 1, high = x / 2, ans = 0;
7
8        while (low <= high) {
9            int mid = low + (high - low) / 2;
10            long square = (long) mid * mid;
11
12            if (square == x) {
13                return mid;
14            } else if (square < x) {
15                ans = mid;
16                low = mid + 1;
17            } else {
18                high = mid - 1;
19            }
20        }
21
22        return ans;
23    }
24}