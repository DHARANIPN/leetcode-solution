// Last updated: 2/6/2026, 10:46:45 AM
class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = nums[0];
        for(int i = 0;i<nums.length;i++){
            currentSum+=nums[i];
             if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;
    }
}