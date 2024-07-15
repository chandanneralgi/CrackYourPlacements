class Solution {
    public static int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProf = 0;
        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                maxProf = Math.max(maxProf, prices[i] - buyPrice);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProf;
    }
}