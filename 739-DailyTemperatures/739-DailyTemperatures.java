// Last updated: 2/6/2026, 10:46:09 AM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> s = new Stack();
        int[] ans = new int[n];
        Arrays.fill(ans,0);
        for(int i =0;i<n;i++){
            while(!s.empty() && temperatures[i] >temperatures[s.peek()]){
                ans[s.peek()]=i-s.peek();
                s.pop();
            }
            s.push(i);
        }
        return ans;
    }                                              //O(n)
}