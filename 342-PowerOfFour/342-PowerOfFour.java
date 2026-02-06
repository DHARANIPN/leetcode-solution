// Last updated: 2/6/2026, 10:46:23 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0) return false;
        while(n%4==0){
            n/=4;
        }if(n==1) return true;
        return false;
    }
}