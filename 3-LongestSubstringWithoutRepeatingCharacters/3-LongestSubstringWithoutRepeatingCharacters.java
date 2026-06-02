// Last updated: 6/2/2026, 11:56:37 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int n = s.length();
4        int maxLength = 0;
5        Set<Character> Set = new HashSet<>();
6        int i = 0;
7        
8        for (int j = 0; j< n; j++) {
9            if (!Set.contains(s.charAt(j))) {
10                Set.add(s.charAt(j));
11                maxLength = Math.max(maxLength, j - i+ 1);
12            } else {
13                while (Set.contains(s.charAt(j))) {
14                    Set.remove(s.charAt(i));
15                     i++;
16                }
17                Set.add(s.charAt(j));
18            }
19        }
20        
21        return maxLength;
22    }
23}