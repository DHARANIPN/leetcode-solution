// Last updated: 2/6/2026, 10:45:34 AM
class Solution {
    public int commonFactors(int a, int b) {
        int m=0;
        int min = a<b?a:b;
        for(int x=1;x<=min;x++){
            if(a%x==0 && b%x == 0) m++;
        }return m;
        
    }
}