// Last updated: 2/6/2026, 10:45:47 AM
class Solution {
    public String longestNiceSubstring(String s) {
       if(s.length() < 2) {
        return "";
       }
    Set <Character> n = new HashSet();
    for(int i =0;i<s.length();i++){
        n.add(s.charAt(i));
    }
    for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
        if(n.contains(Character.toLowerCase(c)) && n.contains(Character.toUpperCase(c))) {
            continue;
        }
        final String r = longestNiceSubstring(s.substring(0,i));
        final String t = longestNiceSubstring(s.substring(i+1));
        return(r.length()>=t.length())? r : t; 
    }
    return s;

    }
}
        