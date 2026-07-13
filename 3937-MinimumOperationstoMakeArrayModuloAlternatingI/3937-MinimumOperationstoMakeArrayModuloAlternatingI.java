// Last updated: 7/13/2026, 8:51:33 AM
1class Solution {
2    public int minOperations(int[] nums, int k) {
3        int min = Integer.MAX_VALUE;
4        for(int i = 0 ; i < k ; i++){
5            for(int j = 0 ; j < k ; j++){
6                if(i == j)
7                    continue;
8                int x = i,y = j,cnt = 0;
9                for(int p = 0 ; p < nums.length ; p++){
10                    if(p % 2 == 0){
11                        cnt += Math.min((nums[p] % k - x + k ) % k,(x - nums[p] % k + k) % k);
12                    }
13                    else{
14                        cnt += Math.min((nums[p] % k - y + k ) % k,(y - nums[p] % k + k) % k);
15                    }
16                }
17                min = Math.min(min,cnt);
18            }
19        }
20        return  min;
21    }
22}