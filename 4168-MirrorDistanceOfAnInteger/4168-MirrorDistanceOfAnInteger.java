// Last updated: 2/6/2026, 10:44:58 AM
class Solution {
    public int mirrorDistance(int n) {
        int rev = 0;
        int temp = n;
        while(n!=0){
               rev = (rev*10) + (n%10);
               n/=10;
        }
        return Math.abs(rev - temp);
    }
}