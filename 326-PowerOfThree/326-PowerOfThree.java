// Last updated: 2/6/2026, 10:46:25 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0) return false;
        while(n%3==0){
            n/=3;
        } if(n==1) return true;
        return false;
    }
}