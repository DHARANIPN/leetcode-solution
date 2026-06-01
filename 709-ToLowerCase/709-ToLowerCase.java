// Last updated: 6/1/2026, 8:50:50 AM
1class Solution {
2    public String toLowerCase(String s) {
3        
4        String result = "";
5
6        for(int i = 0; i < s.length(); i++){
7
8            char ch = s.charAt(i);
9
10            if(65 <= ch && ch <= 90){
11                result += (char)(ch + 32);
12            }
13            else{
14                result += ch;
15            }
16        }
17
18        return result;
19    
20    }
21}