// Last updated: 2/6/2026, 10:45:57 AM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum =0;
        int product = 1;
    while(n!=0){
        int L =n % 10;
        n = n/10;
        sum+=L;
        product*=L;
    }
        return product - sum;
    }
}