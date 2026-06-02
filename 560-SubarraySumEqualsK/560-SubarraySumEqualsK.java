// Last updated: 6/2/2026, 2:42:15 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        map.put(0,1);
5        int sum =0, c=0;
6        for(int i:nums){
7            sum+=i;
8            c+=map.getOrDefault(sum-k,0);
9            map.put(sum,map.getOrDefault(sum,0)+1);
10        }
11        return c;
12    }
13}