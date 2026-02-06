// Last updated: 2/6/2026, 10:46:40 AM
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i-1]) return nums[i-1];
        }
        return nums[nums.length-1];
    }
}