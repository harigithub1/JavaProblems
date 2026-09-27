package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._02_Easy_LC121_BestTimetoBuyandSellStock;

public class OnO1_NotSlidingwindow_TwoPointers {
    public static int maxProfit(int[] prices) {
        int left = 0;
        int maxProfit = 0;
        for (int currIdx = 1; currIdx < prices.length; currIdx++) {
            if (prices[left] < prices[currIdx]) {
                maxProfit = Math.max(maxProfit, prices[currIdx] - prices[left]);
            } else {
                left = currIdx;
                // or we can do left++ too instead of left = currIdx;
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}