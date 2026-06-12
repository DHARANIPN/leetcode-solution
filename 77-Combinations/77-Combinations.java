// Last updated: 6/12/2026, 10:41:24 AM
1class Solution {
2    public List<List<Integer>> combine(int n, int k) {
3        List<List<Integer>> ans = new ArrayList<>();
4        List<Integer> temp = new ArrayList<>();
5        method(ans,n,k,temp,1);
6        return ans;
7    }
8    void method(List<List<Integer>> ans,int n ,int k,List<Integer> temp,int s){
9        if(temp.size() == k) {ans.add(new ArrayList<>(temp));
10        return;}
11        for(int i = s;i<=n;i++){
12            temp.add(i);
13            method(ans,n,k,temp,i+1);
14            temp.remove(temp.size()-1);
15            
16        }
17        
18    }
19}