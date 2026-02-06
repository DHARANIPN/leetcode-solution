// Last updated: 2/6/2026, 10:46:32 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 0) return false;
        while(n%2==0){
            n/=2;
        } 
        if(n==1) return true ;
        return false;
    }
}