// Last updated: 6/2/2026, 10:17:59 AM
1class Solution {
2    public int majorityElement(int[] nums) {
3     
4        for(int i = 0;i<nums.length;i++){
5            int count  = 0;
6            for(int j = 0;j<nums.length;j++){
7                if(nums[i] == nums[j]){
8                    count++;
9                }
10            }
11             if(count>nums.length/2){
12                 return nums[i];
13           
14            }
15        }
16        return -1;
17    }
18}