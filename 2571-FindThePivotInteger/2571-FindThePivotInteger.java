// Last updated: 2/6/2026, 10:45:30 AM
class Solution {
    public int pivotInteger(int n) {
        int T = n*(n+1)/2;
        int x =(int)Math.sqrt(T);
        if((x*x)==T) return x;
        else return -1;
    }
}