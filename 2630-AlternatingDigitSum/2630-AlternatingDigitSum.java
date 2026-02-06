// Last updated: 2/6/2026, 10:45:25 AM
class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        String s = String.valueOf(n);
        for(int i = 0;i<s.length();i++){
            int m = s.charAt(i)-'0';
            if(i%2==0)
                 sum+=m;
            else
                sum-=m;
        }
        return sum;
    }
}