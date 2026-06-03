// Last updated: 6/3/2026, 4:06:33 PM
1class Solution {
2    public int maxi(int[] piles){
3        int m = 0;
4        for(int i : piles){
5            m = Math.max(m,i);
6        }
7        return m;
8    }
9    public int Calculate(int[] piles,int mid){
10        int c = 0;
11        for(int i : piles){
12            //c=Math.ceil(i,mid)
13            c+=(i/mid);
14            if(i%mid != 0){
15                c++;
16            }
17        }
18        return c;
19    }
20    public int minEatingSpeed(int[] piles, int h) {
21        int start = 1;
22        int end = maxi(piles);
23        while(start < end){
24            int mid = (start+end)/2;
25            int cal_hours = Calculate(piles,mid);
26            if(cal_hours > h){
27                start=mid+1;
28            }
29            else{
30                end = mid;
31            }
32        }
33        return start;
34    }
35}