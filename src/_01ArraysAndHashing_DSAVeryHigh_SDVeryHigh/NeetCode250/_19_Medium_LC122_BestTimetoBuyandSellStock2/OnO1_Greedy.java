package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._19_Medium_LC122_BestTimetoBuyandSellStock2;

public class OnO1_Greedy {
    public static int maxProfit(int[] nums) {
        int profit = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                profit = profit + nums[i] - nums[i - 1];
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
 * Why Greedy?
 * At every step, you make the locally optimal choice:
 * If today's price is higher than yesterday's, take the profit immediately.
 * Don't wait for a potentially higher future price.
 */