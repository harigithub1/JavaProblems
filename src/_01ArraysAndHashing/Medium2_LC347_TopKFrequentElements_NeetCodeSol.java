package _01ArraysAndHashing;
import java.util.*;

public class Medium2_LC347_TopKFrequentElements_NeetCodeSol {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<int[]> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(new int[] {entry.getValue(), entry.getKey()});
        }
        list.sort((a, b) -> b[0] - a[0]);

        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = list.get(i)[1];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
}