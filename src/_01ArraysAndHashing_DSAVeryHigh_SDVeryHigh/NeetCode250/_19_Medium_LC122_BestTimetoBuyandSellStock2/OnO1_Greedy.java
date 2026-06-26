package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._19_Medium_LC122_BestTimetoBuyandSellStock2;

public class OnO1_Greedy {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit = profit + prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices)); // 7

//        int[] prices2 = {1, 2, 3, 4, 5};
//        System.out.println(maxProfit(prices2)); // 4
//
//        int[] prices3 = {7, 6, 4, 3, 1};
//        System.out.println(maxProfit(prices3)); // 0
    }
}
/**
 * Pattern used: Greedy
 * Why Greedy?
 *
 * At every step, you make the locally optimal choice:
 *
 * If today's price is higher than yesterday's, take the profit immediately.
 * Don't wait for a potentially higher future price.
 */