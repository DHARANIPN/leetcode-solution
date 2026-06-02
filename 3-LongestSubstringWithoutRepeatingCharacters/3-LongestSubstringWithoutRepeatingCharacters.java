// Last updated: 6/2/2026, 12:07:04 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int c = 0,i=0;
4        Set<Character> Set = new HashSet<>();
5        
6        for (int j = 0; j< s.length(); j++) {
7            if (!Set.contains(s.charAt(j))) {
8                Set.add(s.charAt(j));
9                c = Math.max(c, j - i+ 1);
10            } else {
11                while (Set.contains(s.charAt(j))) {
12                    Set.remove(s.charAt(i));
13                     i++;
14                }
15                Set.add(s.charAt(j));
16            }
17        }   
18        return c;
19    }
20}