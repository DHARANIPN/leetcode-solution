// Last updated: 6/3/2026, 12:14:03 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int L =nums.length;
4        int start = 0;
5        int end =L-1;
6        while(start<=end){
7            int mid = (start + end) / 2;
8            if(nums[mid]  == target ) {
9                return mid;
10            }
11            if(nums[mid] < target){
12                start = mid + 1;
13            }
14            if(nums[mid] > target){
15                 end = mid - 1;
16            } 
17          
18        }
19        return -1;
20    }
21}