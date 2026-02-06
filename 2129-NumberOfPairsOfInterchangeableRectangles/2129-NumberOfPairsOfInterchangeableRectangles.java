// Last updated: 2/6/2026, 10:45:38 AM
class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<Double,Integer> freq = new HashMap();
        long pairs = 0;
        for(int x[] : rectangles){
            double ratio = (double)x[0]/x[1];
            pairs += freq.getOrDefault(ratio,0);
            freq.put(ratio,freq.getOrDefault(ratio,0)+1);
        }
        return pairs;
        
    }
}