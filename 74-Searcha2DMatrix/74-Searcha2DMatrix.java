// Last updated: 6/3/2026, 12:33:16 PM
1class Solution {
2    public boolean searchMatrix(int[][] nums, int target) {
3        int L =nums.length;
4        int start = 0;
5        int row = nums.length;
6        int col = nums[0].length;
7        int end = row*col - 1;
8        while(start<=end){
9            int mid = (start + end) / 2;
10            int val = nums[mid/col][mid%col];
11            if(val  == target ) {
12                return true;
13            }
14            if(val< target){
15                start = mid + 1;
16            }
17            if(val > target){
18                 end = mid - 1;
19            } 
20          
21        }
22        return false;
23    }
24}