// Last updated: 6/5/2026, 11:33:22 AM
1class Solution {
2    public int deleteAndEarn(int[] nums) {
3        int[] temp = new int[10001];
4        for(int i =0;i<nums.length;i++){
5                temp[nums[i]]+= nums[i];
6        }
7        int a =0,b=0,m=0;
8        for(int r : temp){
9            m = Math.max(a,b+r);
10            b=a;
11            a=m;
12        }
13        return m;        
14        }
15}