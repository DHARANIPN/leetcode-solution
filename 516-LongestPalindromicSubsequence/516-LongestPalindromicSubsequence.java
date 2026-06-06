// Last updated: 6/6/2026, 9:53:40 AM
1class Solution {
2    public int recursion(String s,int l,int r,HashMap<String,Integer> map ){
3        int ans = 0;
4        if(l>r) return 0;
5        if(l==r) return 1;
6         String temp = l+","+r;
7        if(map.containsKey(temp)) return map.get(temp);
8        if(s.charAt(l)==s.charAt(r))  ans = 2+ recursion(s,l+1,r-1,map);
9        else ans+=Math.max(recursion(s,l+1,r,map),recursion(s,l,r-1,map));
10        map.put(temp,ans);
11     return ans;
12
13    }
14    
15    public int longestPalindromeSubseq(String s) {
16        // In a string,there will be 2^n subsequence
17        HashMap<String,Integer> map = new HashMap<>();
18        return recursion(s,0,s.length()-1,map);
19
20    }
21}
22
23