// Last updated: 6/2/2026, 8:26:47 PM
1class Solution {
2   public boolean isPalindrome(String s) {
3        if (s.isEmpty()) {
4            return true;
5        }
6
7        int l = 0;
8        int r = s.length() - 1;
9
10        while (l < r) {
11            char leftChar = s.charAt(l);
12            char rightChar = s.charAt(r);
13
14            if (!Character.isLetterOrDigit(leftChar)) {
15                l++;
16            } else if (!Character.isLetterOrDigit(rightChar)) {
17                r--;
18            } else {
19                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
20                    return false;
21                }
22                l++;
23                r--;
24            }
25        }
26
27        return true;
28    }
29}