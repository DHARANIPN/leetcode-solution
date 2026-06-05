// Last updated: 6/5/2026, 3:41:45 PM
1class Solution {
2    public int rob(int[] nums) {
3        int a = 0,b=0,m1=0,m2=0;
4        // for(int i : nums)
5        if(nums.length==1) return nums[0];
6        for(int i = 0;i<=nums.length-2;i++){
7            m1= Math.max(a,b+nums[i]);
8            b=a;
9            a = m1;
10            System.out.println(a+" "+b+" "+m1);
11        }
12        System.out.println(m1+"   ");
13        a=0;b=0;
14        for(int i = nums.length-1;i>=1;i--){
15            m2= Math.max(a,b+nums[i]);
16            b=a;
17            a = m2;
18            
19        }
20         System.out.println(m2);
21        return (m1>m2)?m1:m2;
22    }
23}