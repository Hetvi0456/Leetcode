class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int costPrice = prices[0];
        for(int i=0; i<prices.length; i++)
        {
            if(costPrice > prices[i])
                costPrice = prices[i];
            maxProfit = Math.max(maxProfit, prices[i]-costPrice);
        }
        return maxProfit;
    }
}