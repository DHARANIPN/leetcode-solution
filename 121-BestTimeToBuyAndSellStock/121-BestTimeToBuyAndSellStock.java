// Last updated: 2/6/2026, 10:46:43 AM
class Solution {
    public int maxProfit(int[] prices) {
        int buyingPrice = prices[0];
        int maximumProfit = 0;
        for(int i = 1;i < prices.length;i++){
            int sellingPrice = prices[i];
            if(sellingPrice > buyingPrice){
                int profit = sellingPrice - buyingPrice;
                if(maximumProfit < profit){
                    maximumProfit = profit;
                }
            }
            else{
                    buyingPrice = prices[i];
                }
        }
        return maximumProfit;
    }
}