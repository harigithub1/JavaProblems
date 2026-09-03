package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._02_Easy_LC121_BestTimetoBuyandSellStock;

public class OnO1_TwoPointers_notSlidingwindow {
    public static int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int maxProfit = 0;
        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                maxProfit = Math.max(maxProfit, prices[r] - prices[l]);
            } else {
                l = r;
            }
            r++;
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}