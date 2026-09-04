package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._37_Easy_LC121_BestTimetoBuyandSellStock;

public class OnO1_TwoPointers_notSlidingwindow {
    public static int maxProfit(int[] prices) {
        int l = 0;
        int currentIndex = 1;
        int maxProfit = 0;
        while (currentIndex < prices.length) {
            if (prices[l] < prices[currentIndex]) {
                maxProfit = Math.max(maxProfit, prices[currentIndex] - prices[l]);
            } else {
                l = currentIndex;
            }
            currentIndex++;
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}