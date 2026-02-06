// Last updated: 2/6/2026, 10:45:06 AM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int bob = 0; // double digit
        int alice = 0;//single digit
        for(int x:nums){
            if(x<10) alice += x;
            else bob += x;
        }return alice!=bob;
  }
}