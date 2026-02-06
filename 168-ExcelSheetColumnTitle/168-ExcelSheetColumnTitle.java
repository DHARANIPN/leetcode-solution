// Last updated: 2/6/2026, 10:46:39 AM
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuffer ans = new StringBuffer();
        while(columnNumber > 0){
                columnNumber--;
                ans.append( (char)((columnNumber%26)+65) );
                columnNumber/=26;
        }
        return ans.reverse().toString();
    }
        
}