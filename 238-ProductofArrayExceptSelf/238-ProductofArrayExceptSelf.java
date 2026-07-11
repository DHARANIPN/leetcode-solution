// Last updated: 7/11/2026, 12:25:50 PM
1public class Solution {
2     private boolean isPalindrome(String str) {
3        int left = 0;
4        int right = str.length() - 1;
5
6        while (left < right) {
7            if (str.charAt(left) != str.charAt(right)) {
8                return false;
9            }
10            left++;
11            right--;
12        }
13
14        return true;
15    }
16    public String longestPalindrome(String s) {
17        if (s.length() <= 1) {
18            return s;
19        }
20
21        int maxLen = 1;
22        String maxStr = s.substring(0, 1);
23
24        for (int i = 0; i < s.length(); i++) {
25            for (int j = i + maxLen; j <= s.length(); j++) {
26                if (j - i > maxLen && isPalindrome(s.substring(i, j))) {
27                    maxLen = j - i;
28                    maxStr = s.substring(i, j);
29                }
30            }
31        }
32
33        return maxStr;
34    }
35
36   
37}