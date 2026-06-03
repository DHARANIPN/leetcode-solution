// Last updated: 6/3/2026, 10:52:24 AM
1class Solution {
2    public void reverse(int[] arr,int start , int end){
3        while(start<end){
4            int t = arr[start];
5            arr[start]= arr[end];
6            arr[end]= t;
7            start++;
8            end--;
9        }
10    }
11    public void rotate(int[] nums, int k) {
12        int n = nums.length;
13        k%=n;
14        reverse(nums,0,n-1);
15        reverse(nums,0,k-1);
16        reverse(nums,k,n-1);
17
18    }
19}