// Last updated: 5/24/2026, 9:22:48 AM
1class Solution {
2    public int[] limitOccurrences(int[] nums, int k) {
3        List<Integer>res = new ArrayList<>();
4        int count = 0;
5        for(int i=0;i<nums.length;i++){
6            if(i==0||nums[i]!=nums[i-1])
7                count = 1;
8            else 
9                count++;
10            if(count<=k)
11                res.add(nums[i]);
12        }
13        return res.stream().mapToInt(i->i).toArray();
14    }
15}