// Last updated: 2/6/2026, 10:45:29 AM
class Solution {
    public int numberOfCuts(int n) {
        if(n%2==0)  return n/2;
        else{
            if(n==1) return 0;
            else return n;
        }
    }
}