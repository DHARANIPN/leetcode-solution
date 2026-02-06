// Last updated: 2/6/2026, 10:45:21 AM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k<= numOnes) return k;
        else{
            if(k<=(numOnes+ numZeros)) return numOnes;
            else{
                int r= k-(numOnes+numZeros);
                return numOnes - r;
            }
        }
    }
}