// Last updated: 6/2/2026, 11:57:24 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int maxLength = 0;
4        Set<Character> Set = new HashSet<>();
5        int i = 0;
6        
7        for (int j = 0; j< s.length(); j++) {
8            if (!Set.contains(s.charAt(j))) {
9                Set.add(s.charAt(j));
10                maxLength = Math.max(maxLength, j - i+ 1);
11            } else {
12                while (Set.contains(s.charAt(j))) {
13                    Set.remove(s.charAt(i));
14                     i++;
15                }
16                Set.add(s.charAt(j));
17            }
18        }
19        
20        return maxLength;
21    }
22}