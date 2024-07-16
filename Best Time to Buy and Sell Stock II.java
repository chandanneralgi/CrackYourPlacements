class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int profit = 0;
        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                profit += prices[i] - buyPrice;
                buyPrice = prices[i];
            }else{
                buyPrice = prices[i];
            }
        }
        return profit;
    }
}