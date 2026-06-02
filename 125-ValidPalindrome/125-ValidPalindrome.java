// Last updated: 6/2/2026, 8:41:54 PM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        int i = s.length() - 1;
4        while (i >= 0 && s.charAt(i) == ' ') {
5            i--;
6        }
7        int end = i;
8        while (i >= 0 && s.charAt(i) != ' ') {
9            i--;
10        }
11
12        return end - i;
13    }
14}