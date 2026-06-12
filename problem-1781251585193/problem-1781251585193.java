// Last updated: 6/12/2026, 1:36:25 PM
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        bt(nums,new ArrayList<>(),result);
5        return result;
6    }
7    void bt(int[] nums,  List<Integer> temp,List<List<Integer>> result){
8        if(temp.size() == nums.length){
9            result.add(new ArrayList<>(temp));
10        }
11        else{
12            for(int i =0;i<nums.length;i++){
13                if(temp.contains(nums[i])){
14                    continue;
15                }
16                  temp.add(nums[i]);
17                  bt(nums,temp,result);
18                 temp.remove(temp.size()-1);
19            }
20        }
21    }
22}