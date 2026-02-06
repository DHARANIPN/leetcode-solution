// Last updated: 2/6/2026, 10:45:02 AM
class Solution {
    public long sumAndMultiply(int n) {
        int r = 0,sum = 0,j = 1;
        while(n>0){
            int m =n%10;
            n/=10;
            if(m==0) continue;
            sum+=m;
            r+=(m*j);
            j*=10;    
        }
        return (long)r*sum;
    }
}