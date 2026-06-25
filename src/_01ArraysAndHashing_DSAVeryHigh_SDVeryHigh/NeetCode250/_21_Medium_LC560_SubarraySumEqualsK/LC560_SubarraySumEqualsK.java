package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._21_Medium_LC560_SubarraySumEqualsK;

public class LC560_SubarraySumEqualsK {
public int subarraySum(int[] nums, int k) {
        int res = 0, curSum = 0;
        Map<Integer, Integer> prefixSums = new HashMap<>();
        prefixSums.put(0, 1);

        for (int num : nums) {
            curSum += num;
            int diff = curSum - k;
            res += prefixSums.getOrDefault(diff, 0);
            prefixSums.put(curSum, prefixSums.getOrDefault(curSum, 0) + 1);
        }

        return res;
    }
}