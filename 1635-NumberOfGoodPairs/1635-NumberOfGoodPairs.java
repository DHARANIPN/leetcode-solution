// Last updated: 2/6/2026, 10:45:52 AM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int x : nums){
            freq.put(x,freq.getOrDefault(x,0)+1);
        }
        int pairs = 0;
    
        for(int n:freq.values()){
            pairs+=(n*(n-1))/2;
        }
        return pairs;
    }
}