// Last updated: 6/12/2026, 2:42:58 PM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> ans = new ArrayList<>();
4        //  Arrays.sort(nums);
5        bt(ans,new ArrayList<>(),nums,0);
6        return ans;
7    }
8    void bt(List<List<Integer>> ans,List<Integer> temp,int[] nums,int s){
9         ans.add(new ArrayList<>(temp));
10        for(int i = s; i < nums.length; i++){
11            temp.add(nums[i]);
12            bt(ans,temp,nums,i+1);
13            temp.remove(temp.size()-1);
14       }
15    }
16}
17
18
19