// Last updated: 2/6/2026, 10:45:11 AM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int t = x;
        int sum = 0;
        while(x>0){
            int R = x%10;
            sum+=R;
            x=x/10;
        } if(t%sum==0) {
                return sum;
        }return -1;
    }
}