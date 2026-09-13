package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._02_Easy_LC121_BestTimetoBuyandSellStock;

public class OnO1_TwoPointers_notSlidingwindow_V2 {
    public static int maxProfit(int[] prices){
        int l=0;
        int maxProfit=0;
        for(int r=0;r<prices.length;r++){
            maxProfit=Math.max(maxProfit,prices[r]-prices[l]);
            if(prices[r]<prices[l]){
                l=r;
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}