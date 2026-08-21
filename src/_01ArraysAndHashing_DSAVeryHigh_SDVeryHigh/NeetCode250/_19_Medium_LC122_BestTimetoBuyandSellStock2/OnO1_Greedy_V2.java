package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._19_Medium_LC122_BestTimetoBuyandSellStock2;

public class OnO1_Greedy_V2 {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                profit = profit + prices[i + 1] - prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices)); // 7
    }
}
/**
 * Pattern used: Greedy
 */