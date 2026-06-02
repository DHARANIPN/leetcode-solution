// Last updated: 6/2/2026, 10:46:33 AM
1class Solution {
2    public int majorityElement(int[] nums) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        int ans =0;
5        int n = nums.length;
6        for(int i:nums){
7            if(map.containsKey(i)){
8                map.put(i,map.get(i)+1);
9            }
10            else{ 
11                map.put(i,1); //map.put(1,map.getOrDefault(i,0)+1);
12            }
13            if(map.get(i)>n/2){
14                ans = i;
15            }
16        }
17        System.out.println(map);
18        return ans;
19    }
20}