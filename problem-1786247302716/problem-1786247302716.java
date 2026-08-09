// Last updated: 8/9/2026, 9:18:22 AM
1class Solution {
2    public double minPrice(int[] prices, int[] discounts) {
3        Arrays.sort(prices);
4        Arrays.sort(discounts);
5        double tp = 0.0;
6        int pi = prices.length-1;
7        int di = discounts.length-1;
8        while(pi>=0){
9            if(di>=0){
10                tp+=prices[pi]*(100.0 - discounts[di])/100.0;
11                di--;
12            }else{
13                tp += prices[pi];
14            }
15            pi--;
16        }
17        return tp;
18    }
19}