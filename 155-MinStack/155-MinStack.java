// Last updated: 6/2/2026, 10:16:12 AM
1class Solution {
2    public int majorityElement(int[] nums) {
3        int n = nums.length;
4        for(int i = 0;i<n;i++){
5            int count  = 0;
6            for(int j = 0;j<n;j++){
7                if(nums[i] == nums[j]){
8                    count++;
9                }
10            }
11             if(count>n/2){
12                 return nums[i];
13           
14            }
15        }
16        return -1;
17    }
18}