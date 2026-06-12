// Last updated: 6/12/2026, 3:53:14 PM
1class Solution {
2    int fact(int n){
3        int f =1;
4        for(int i =1;i<=n;i++){
5            f*=i;
6        }
7        return f;
8    }
9    public String getPermutation(int n, int k) {
10        List<Integer> arr = new ArrayList<>();
11        for(int i=1;i<=n;i++){
12            arr.add(i);
13        }
14        k-=1;
15        k%=fact(n);
16        String s = "";
17        for(int i=0;i<n;i++){
18            int m =fact(n-(i+1));
19             int r = k/m;
20             s = s+ arr.get(r);
21             arr.remove(r);
22             k%=m;
23             if(arr.size() == 1){
24                s = s+arr.get(0);
25                break;
26             }
27    }
28    return s;
29    }
30}