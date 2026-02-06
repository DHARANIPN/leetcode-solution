// Last updated: 2/6/2026, 10:45:43 AM
class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i =0;i<n;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}