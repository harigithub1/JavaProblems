package _01ArraysAndHashing;
import java.util.*;

public class Medium2_LC347_TopKFrequentElements_Beginner {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }
        arr.sort((a, b) -> b[0] - a[0]);

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr.get(i)[1];
        }
        return res;
    }
    public static void main(String[] args) {

        // Example 1
        int[] nums1 = {1,1,1,2,2,3};
        int k1 = 2;
        System.out.println(Arrays.toString(topKFrequent(nums1, k1)));
    }
}