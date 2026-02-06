// Last updated: 2/6/2026, 10:46:17 AM
class Solution {
    public int arrangeCoins(int n) {
        int row = 1;
        while(n>=row){
            n=n-row;
            row++;
        }
        return row-1;
    }
}