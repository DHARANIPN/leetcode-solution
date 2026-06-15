// Last updated: 6/15/2026, 2:57:45 PM
1class Solution {
2    public void nextPermutation(int[] nums) {
3        int n = nums.length;
4        int i = n - 2;
5        
6        while (i >= 0 && nums[i] >= nums[i + 1]) {
7            i--;
8        }
9        
10        if (i >= 0) {
11            int j = n - 1;
12            while (nums[j] <= nums[i]) {
13                j--;
14            }
15            swap(nums, i, j);
16        }
17        
18        reverse(nums, i + 1, n - 1);
19    }
20    
21    private void swap(int[] nums, int i, int j) {
22        int temp = nums[i];
23        nums[i] = nums[j];
24        nums[j] = temp;
25    }
26    
27    private void reverse(int[] nums, int left, int right) {
28        while (left < right) {
29            swap(nums, left, right);
30            left++;
31            right--;
32        }
33    }
34}