// Last updated: 2/6/2026, 10:45:33 AM
class Solution {
    public int averageValue(int[] nums) {
        int avg = 0;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%6==0){
                avg=avg+nums[i];
                count++;
                
            }
        }
        if(avg==0) return 0;
        return avg/count;
    }
}