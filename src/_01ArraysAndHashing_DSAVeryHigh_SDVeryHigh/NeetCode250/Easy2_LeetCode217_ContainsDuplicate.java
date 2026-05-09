package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250;

import java.util.HashSet;
import java.util.Set;

public class Easy2_LeetCode217_ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                return true;
            }
            set.add(n);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }
}
/**
 * You can describe this as:
 *
 * 🟢 "HashSet Lookup Pattern"
 * 🟢 "Seen Before Pattern"
 * 🟢 "Duplicate Detection Using Set"
 */
/**
 * //set.add(num) will add num to the set and returns true if num is not present already
 */

