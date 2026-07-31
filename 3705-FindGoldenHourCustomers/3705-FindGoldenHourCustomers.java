// Last updated: 7/31/2026, 8:32:45 AM
1class Solution {
2    public int compareVersion(String version1, String version2) {
3        int i = 0, j = 0;
4        while (i < version1.length() || j < version2.length()) {
5            int num1 = 0, num2 = 0;
6            while (i < version1.length() && version1.charAt(i) != '.') {
7                num1 = num1 * 10 + (version1.charAt(i++) - '0');
8            }
9            while (j < version2.length() && version2.charAt(j) != '.') {
10                num2 = num2 * 10 + (version2.charAt(j++) - '0');
11            }
12            if (num1 < num2) {
13                return -1;
14            }
15            if (num1 > num2) {
16                return 1;
17            }
18            i++;
19            j++;
20        }
21        return 0;
22    }
23}