// Last updated: 2/6/2026, 10:45:27 AM
class Solution {
    public int countDigits(int num) {
        int count =0;
        int t = num;
        while( num!= 0){
            int R= num%10;
            if(t%R==0) count++;
            num = num/10;
        }return count;
    }
}