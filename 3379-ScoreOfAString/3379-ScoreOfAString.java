// Last updated: 2/6/2026, 10:45:10 AM
class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for(int i=1;i<s.length();i++){
            score += Math.abs(s.charAt(i-1)- s.charAt(i));
        
        }
        return score;
    }
}