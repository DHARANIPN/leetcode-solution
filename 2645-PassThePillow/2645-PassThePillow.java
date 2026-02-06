// Last updated: 2/6/2026, 10:45:24 AM
class Solution {
    public int passThePillow(int n, int time) {
        int f =time/(n-1);
        int r = time%(n-1);
        if(f%2==0) return r+1;
        else  return n - r;
    }
}
