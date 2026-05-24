// Last updated: 5/24/2026, 9:32:27 AM
1class Solution {
2    public int passwordStrength(String password) {
3        Set<Character> lower  = new HashSet<>();
4        Set<Character> upper  = new HashSet<>();
5        Set<Character> digits  = new HashSet<>();
6        Set<Character> special  = new HashSet<>();
7        String specialChars = "!@#$";
8        for(char c:password.toCharArray()){
9            if(c>='a'&& c<='z')
10                lower.add(c);
11            else if (c>='A' && c <= 'Z')
12                upper.add(c);
13            else if(c>='0' && c<='9')
14                digits.add(c);
15            else if (specialChars.indexOf(c)!= -1) special.add(c);
16        }
17        return lower.size()+2*upper.size()+3*digits.size()+5*special.size();
18    }
19}