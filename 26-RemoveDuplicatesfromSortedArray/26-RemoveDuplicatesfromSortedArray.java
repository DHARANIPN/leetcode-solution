// Last updated: 6/20/2026, 2:31:01 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int j =0;
4        for(int i =1;i<nums.length;i++){
5            if(nums[i]!=nums[i-1]) nums[++j]=nums[i];
6        }
7        return ++j;
8    }
9}