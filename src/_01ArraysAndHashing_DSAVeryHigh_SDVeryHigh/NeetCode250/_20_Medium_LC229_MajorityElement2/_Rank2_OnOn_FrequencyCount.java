package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._20_Medium_LC229_MajorityElement2;
import java.util.*;
public class _Rank2_OnOn_FrequencyCount {
    public static List<Integer> majorityElement2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) > nums.length / 3) {
                list.add(key);
            }
        }

        return list;
    }
    public static void main(String[] args) {
//        int[] nums = {1, 1, 1, 3, 3, 2, 2, 2};
        int[] nums = {1, 3, 3, 2, 2, 2, 2, 2};
        List<Integer> res = majorityElement2(nums); // [1, 2]
        System.out.println(res);
//        int[] nums1 = {3, 2, 3};
//        System.out.println(majorityElement(nums1)); // [3]
//        int[] nums2 = {1};
//        System.out.println(majorityElement(nums2)); // [1]
//        int[] nums3 = {1, 2};
//        System.out.println(majorityElement(nums3)); // [1, 2]
    }
}
