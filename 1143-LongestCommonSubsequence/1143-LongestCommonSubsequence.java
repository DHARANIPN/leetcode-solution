// Last updated: 6/6/2026, 10:36:13 AM
1class Solution {
2    public int recursion(String text1, String text2,int x,int y, HashMap<String,Integer> map){
3        int ans = 0 ;
4        if(x==text1.length() || y==text2.length()) return 0;
5        String temp = x+","+y;
6        if(map.containsKey(temp)) return map.get(temp);
7        if(text1.charAt(x)==text2.charAt(y)) ans = 1+recursion(text1,text2,x+1,y+1,map);
8        else  ans+= Math.max(recursion(text1,text2,x+1,y,map),recursion(text1,text2,x,y+1,map));
9        map.put(temp,ans);
10        return ans;
11    }
12    public int longestCommonSubsequence(String text1, String text2) {
13        HashMap<String,Integer> map= new HashMap<>();
14        return recursion(text1,text2,0,0,map);
15    }
16}