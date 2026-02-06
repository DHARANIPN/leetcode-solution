// Last updated: 2/6/2026, 10:46:49 AM
class Solution {
    public boolean isPalindrome(int n) {
        if(n<0) return false;
        int rev = 0;
        int O = n;
        while(n!=0){
            rev = (rev*10)+ n%10;
            n= n/10;
            }if(O == rev ) return true;
            return false;
    }
}
