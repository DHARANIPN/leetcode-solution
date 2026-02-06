// Last updated: 2/6/2026, 10:45:09 AM
class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]%3!=0){
                count++;
            }
        }return count;
        
    }
}