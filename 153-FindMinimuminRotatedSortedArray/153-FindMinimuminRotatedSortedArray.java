// Last updated: 6/3/2026, 2:09:40 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int L =nums.length;
4        int start = 0;
5        int end =L-1;
6        while(start<end){
7            int mid = (start + end) / 2;
8            if(nums[end] <= nums[mid]){
9                start = mid + 1;
10            } 
11            else{
12                end = mid; 
13            }
14       }
15           return nums[end];       
16    
17    }
18}