// Last updated: 2/6/2026, 10:46:46 AM
class Solution {
    public int divide(int dividend, int divisor) {
        if( dividend == -2147483648 && divisor == -1) return 2147483647;
        int result = dividend/divisor;
        return result;
    }
}