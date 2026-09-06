package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._37_Easy_LC121_BestTimetoBuyandSellStock;

public class OnO1_TwoPointers_notSlidingwindow {
    public static int maxProfit(int[] prices) {
        int l = 0;
        int right = 1;
        int maxProfit = 0;
        // here variable right is current index
        while (right < prices.length) {
            if (prices[l] < prices[right]) {
                maxProfit = Math.max(maxProfit, prices[right] - prices[l]);
            } else {
                l = right;
            }
            right++;
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}