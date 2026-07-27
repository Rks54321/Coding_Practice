package arrays;

public class BestTimeToBuySellStock {
    static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(buySellStock(prices));
    }
    public static int buySellStock(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices) {
            minPrice = Math.min(minPrice, price);
            int profit = price - minPrice;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }

}
