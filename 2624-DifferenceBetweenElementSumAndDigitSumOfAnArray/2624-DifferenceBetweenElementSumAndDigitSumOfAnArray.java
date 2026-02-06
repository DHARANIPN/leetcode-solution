// Last updated: 2/6/2026, 10:45:26 AM
class Solution {
    public int differenceOfSum(int[] nums) {
        int  elementSum = 0;
        int DigitSum =0;
        for(int i=0;i<nums.length;i++){
            elementSum =  elementSum+nums[i];
        }
        for(int i =0;i<nums.length;i++){
            while(nums[i]>0)
           { 
            DigitSum += (nums[i]%10);
            nums[i]/=10;
            }
        }
        return Math.abs(DigitSum-elementSum);
    }
}