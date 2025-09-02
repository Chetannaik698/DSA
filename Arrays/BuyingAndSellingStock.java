package Arrays;

public class BuyingAndSellingStock {

    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfix  = 0;

        for(int i=0; i<prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfix = Math.max(maxProfix, profit);
            }else {
                buyPrice = prices[i];
            }
        }

        return maxProfix;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4, 8};
        System.out.println(buyAndSellStocks(prices));
    }
}  