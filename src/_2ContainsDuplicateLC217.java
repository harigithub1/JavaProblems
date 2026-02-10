import java.util.HashSet;
import java.util.Set;

public class _2ContainsDuplicateLC217 {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
            set.add(num);
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
 * 🟢 “HashSet Lookup Pattern”
 * 🟢 “Seen Before Pattern”
 * 🟢 “Duplicate Detection Using Set”
 */
/**
 * //set.add(num) will add num to the set and returns true if num is not present already
 */