// Last updated: 2/6/2026, 10:46:27 AM
class Solution {
    public int missingNumber(int[] nums) {
        int total = 0;
        int n = nums.length;
        int sum = (n*(n+1))/ 2;
        for(int i =0;i<n;i++){
            total += nums[i];
        }
        return sum - total;

    }
}