// Last updated: 2/6/2026, 10:45:00 AM
class Solution {
    public int absDifference(int[] nums, int k) {
        int Greater = 0;
        int lower = 0;
        Arrays.sort(nums);
        for(int i = 0;i<k;i++){
            lower += nums[i];
        }
        for(int i=nums.length-1;i>=nums.length-k;i--){
            Greater += nums[i];
        } 
        return Math.abs(Greater-lower);
        
    }
}
