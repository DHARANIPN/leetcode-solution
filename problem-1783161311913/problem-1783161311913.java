// Last updated: 7/4/2026, 4:05:11 PM
1class Solution {
2    public int minimumSwaps(int[] nums) {
3        int k=0;
4        for(int i : nums){
5            if(i!=0) k++;
6        }
7        int s =0;
8        for(int i =0;i<k;i++){
9            if(nums[i]==0) s++;
10        }
11        return s;
12    }
13}