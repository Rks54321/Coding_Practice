package arrays;

public class BestTimeToBuyandSell {
    static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int min = Integer.MAX_VALUE, profit = 0;
        for(int price : prices) {
            min = Math.min(min, price);
            profit = Math.max(profit, price - min);
        }
        System.out.println(profit);
    }
}
