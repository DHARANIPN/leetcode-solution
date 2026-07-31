// Last updated: 7/31/2026, 8:32:10 AM
1/* The isBadVersion API is defined in the parent class VersionControl.
2      boolean isBadVersion(int version); */
3
4public class Solution extends VersionControl {
5    public int firstBadVersion(int n) {
6          int l = 1;
7        int r = n;
8
9        while (l <= r) {
10            int m = l + (r - l) / 2;
11
12            if (isBadVersion(m)) {
13                // m is bad, but an earlier bad version may exist.
14                r = m - 1;
15            } else {
16                // m is good, so the first bad version is after m.
17                l = m + 1;
18            }
19        }
20
21        return l;
22    }
23}
24        
25