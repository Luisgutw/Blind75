package Code;

public class BuySellStock {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int maxProfit = 0;
        int minPurchase = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - minPurchase > maxProfit)
                maxProfit = prices[i] - minPurchase;
            if (prices[i] < minPurchase)
                minPurchase = prices[i];
        }
        return maxProfit;
    }
}
