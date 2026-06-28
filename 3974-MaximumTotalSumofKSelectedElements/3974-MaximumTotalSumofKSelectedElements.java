// Last updated: 6/28/2026, 9:10:42 PM
1class Solution {
2    public long maxSum(int[] nums, int k, int mul) {
3        Arrays.sort(nums);
4        int n = nums.length;
5        int i = n-1;
6        long ans = 0;
7        while(k > 0){
8            if(mul >0){
9                ans += (long)nums[i]*mul;
10            }
11            else ans += (long)nums[i];
12            i--;
13            k--;
14            mul--;
15        }
16        return ans;
17    }
18}