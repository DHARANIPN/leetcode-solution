// Last updated: 2/6/2026, 10:46:36 AM
class Solution {
    public int trailingZeroes(int n) {
        if(n<=0) return 0;
        int sum = 0;
        while(n!=0){
            n/=5;
            sum+=n;
        }
        return sum;
    }
}