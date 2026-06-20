// Last updated: 6/20/2026, 8:37:39 PM
1class Solution {
2    public boolean check(int[] nums) {
3        int c=0;
4       for(int i =0;i<nums.length;i++){
5         if(nums[i]> nums[(i+1)%nums.length])  c++;
6         }
7         return c<=1;
8         
9    }
10}