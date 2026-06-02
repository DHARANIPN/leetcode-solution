// Last updated: 6/2/2026, 9:01:08 PM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        String prefix = strs[0];
4        for (int i = 1; i < strs.length; i++) {
5            while (!strs[i].startsWith(prefix)) {
6                prefix = prefix.substring(0, prefix.length() - 1);
7                if (prefix.isEmpty()) {
8                    return "";
9                }
10            }
11        }
12        return prefix;
13    }
14}