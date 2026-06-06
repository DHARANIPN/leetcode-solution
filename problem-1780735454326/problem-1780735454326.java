// Last updated: 6/6/2026, 2:14:14 PM
1class Solution {
2    public int[] plusOne(int[] digits) {
3        for (int i = digits.length - 1; i >= 0; i--) {
4            if (digits[i] + 1 != 10) {
5                digits[i] += 1;
6                return digits;
7            }
8            digits[i] = 0;
9        }
10        
11        int[] arr = new int[digits.length + 1];
12        arr[0] = 1;
13        return arr;        
14    }
15}