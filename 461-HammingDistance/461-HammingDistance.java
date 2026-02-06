// Last updated: 2/6/2026, 10:46:16 AM
class Solution {
    public int hammingDistance(int x, int y) {
        int count =0;
        int n =x^y;
        while(n!=0){
            n = n&(n-1);
            count++;
        }
        return count;
    }
}