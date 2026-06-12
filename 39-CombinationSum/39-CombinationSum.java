// Last updated: 6/12/2026, 11:35:27 AM
1class Solution {
2    public List<List<Integer>> combinationSum2(int[] c, int t) {
3        List<List<Integer>> ans = new ArrayList<>();
4        Arrays.sort(c);
5        List<Integer> temp = new ArrayList<>();
6        method(ans,c,t,temp,0);
7        return ans;
8    }
9    void method(List<List<Integer>> ans,int []c ,int t ,List<Integer> temp,int s){
10        if(t == 0 ) {
11            if(!ans.contains(temp))
12            ans.add(new ArrayList<>(temp));
13        return;
14        }
15        if(t<0) return;
16        for(int i = s;i<c.length;i++){
17           if (i > s && c[i] == c[i - 1]) {
18                continue;
19            }
20           
21            
22            temp.add(c[i]);
23            method(ans,c,t-c[i],temp,i+1);
24            temp.remove(temp.size()-1);
25            
26        
27        
28    }
29}
30}