// Last updated: 2/6/2026, 10:46:10 AM
class Solution {
    public boolean hasAlternatingBits(int n) {
        int w =(n^(n>>1));
        return (w&(w+1)) ==0 ? true: false;
        }
    }
