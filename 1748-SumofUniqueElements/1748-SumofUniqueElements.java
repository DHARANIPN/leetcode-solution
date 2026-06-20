// Last updated: 6/20/2026, 9:08:14 PM
1import java.util.Arrays;
2
3class Solution {
4    public int sumOfUnique(int[] nums) {
5        int sum = 0;
6        Arrays.sort(nums); 
7
8        for (int i = 0; i < nums.length; i++) {
9            
10          
11            if (i == 0 || nums[i] != nums[i - 1]) {
12        
13                if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
14                    sum += nums[i]; 
15                }
16            }
17        } 
18        return sum; 
19    } 
20}