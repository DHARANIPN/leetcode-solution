// Last updated: 6/6/2026, 1:53:11 PM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        //tabulation 
4        if(nums.length<=1) return nums.length;
5        int[] arr = new int[nums.length];
6        arr[nums.length-1] = 1;
7        int max = 0;
8    
9        for(int i =nums.length-2;i>=0;i--){
10            int ans = 0;
11            for(int j = i+1;j<nums.length;j++){
12                
13                if(nums[i]<nums[j]){
14                    ans = Math.max(ans,arr[j]);
15                }
16            }
17            arr[i] = ans+1;
18            max = Math.max(max,arr[i]);
19        }
20       return  max;
21    }
22    
23}