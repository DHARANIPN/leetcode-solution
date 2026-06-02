// Last updated: 6/2/2026, 4:25:08 PM
1class Solution {
2    public int[] maxSlidingWindow(int[] nums, int k) {
3        //array sixe n-k+1
4        int res[] = new int[nums.length-k+1];
5        int a = 0;
6        Deque<Integer> dq = new ArrayDeque<>();
7        for(int i =0;i<nums.length;i++){
8            if(!dq.isEmpty() && dq.peekFirst()<i-k+1){
9                dq.pollFirst();
10            }
11            while(!dq.isEmpty() && nums[dq.peekLast()] <nums[i]){
12                dq.pollLast();
13            }
14            dq.offerLast(i);
15            if(i>=k-1) res[a++] = nums[dq.peekFirst()];
16
17        }
18        return res;
19
20    }
21}