// Last updated: 2/6/2026, 10:46:51 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap();
        for(int i =0;i<nums.length;i++){
            int x = target - nums[i];
            if(map.containsKey(x)){
                return new int[]{i,map.get(x)};
            }
            else{
                map.put(nums[i],i);
            }
        }return new int[]{-1,-1};
    }
}