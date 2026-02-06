// Last updated: 2/6/2026, 10:46:01 AM
class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        int prev=0;
        int prev2=1;
        int prev3=1;
        int next=0;
        for(int i =1;i<=n-2;i++){
            next=prev+ prev2 + prev3;
            prev = prev2;
            prev2 = prev3;
            prev3 =next;
        }
        return next;
    }
}