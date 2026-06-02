// Last updated: 6/2/2026, 12:24:59 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashMap<Character,Integer> map=new HashMap<>();
4        int i = 0,j=0,max = 0,count=0;
5        while(j<s.length()){
6            char z=s.charAt(j);
7            if(map.containsKey(z)){
8                i=Math.max(i,map.get(z)+1);
9            }
10            map.put(z,j);
11            max=Math.max(max,j-i+1);
12            j++;
13        }
14        return max; 
15    }
16}