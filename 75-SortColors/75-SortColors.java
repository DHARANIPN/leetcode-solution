// Last updated: 2/6/2026, 10:46:44 AM
class Solution {
    public void sortColors(int[] nums) {
      int ZeroIndex = 0;
      int  twoIndex = nums.length-1;
      int i=0;
      while(i<=twoIndex){
        if(nums[i] == 0){
            int t = nums[i];
            nums[i++] = nums[ZeroIndex];
            nums[ZeroIndex++] = t;
        }
        else if (nums[i] == 1) ++i;
        else{
            int t = nums[i];
            nums[i] = nums[twoIndex];
            nums[twoIndex--] = t;
        }
      }
    }
}