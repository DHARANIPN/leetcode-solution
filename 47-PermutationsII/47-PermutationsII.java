// Last updated: 6/15/2026, 3:33:01 PM
1public class Solution {
2    public List<List<Integer>> permuteUnique(int[] nums) {
3        List<List<Integer>> res = new ArrayList<List<Integer>>();
4        if(nums==null || nums.length==0) return res;
5        boolean[] used = new boolean[nums.length];
6        List<Integer> list = new ArrayList<Integer>();
7        Arrays.sort(nums);
8        dfs(nums, used, list, res);
9        return res;
10    }
11
12    public void dfs(int[] nums, boolean[] used, List<Integer> list, List<List<Integer>> res){
13        if(list.size()==nums.length){
14            res.add(new ArrayList<Integer>(list));
15            return;
16        }
17        for(int i=0;i<nums.length;i++){
18            if(used[i]) continue;
19            if(i>0 &&nums[i-1]==nums[i] && !used[i-1]) continue;
20            used[i]=true;
21            list.add(nums[i]);
22            dfs(nums,used,list,res);
23            used[i]=false;
24            list.remove(list.size()-1);
25        }
26    }
27}