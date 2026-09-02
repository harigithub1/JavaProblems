package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._02_Easy_LC121_BestTimetoBuyandSellStock;

public class OnO1_TwoPointers {
    public static int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int maxP = 0;
        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                maxP = Math.max(maxP, profit);
            } else {
                l = r;
            }
            r++;
        }
        return maxP;
    }

    public static void main(String args[]) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}