// Last updated: 6/6/2026, 3:21:38 PM
1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        
4        int r = 0;
5        for(int i = nums.length-1;i>=0;i--){
6            r+=nums[i];
7        }
8        int l =0;
9        int[] ans  = new int[nums.length];
10        for(int i = nums.length-1;i>=0;i--){ 
11            r-=nums[i];
12            ans[i] = Math.abs(l-r);
13            l+=nums[i];
14        }
15        return ans;
16    }
17}