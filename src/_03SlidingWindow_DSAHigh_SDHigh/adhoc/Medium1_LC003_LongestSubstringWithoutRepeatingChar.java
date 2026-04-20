package _03SlidingWindow_DSAHigh_SDHigh.adhoc;

import java.util.HashSet;
import java.util.Set;

public class Medium1_LC003_LongestSubstringWithoutRepeatingChar {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            System.out.println(set);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
//        System.out.println(lengthOfLongestSubstring("bbbbb"));
//        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
/**
 * Pattern: Sliding Window (Two Pointers) Pattern
 * remove characters one by one from left untill c is removed (set.remove(s.charAt(left));)
 * i.e slide the window’s left side forward until the duplicate is gone.
 */
/**
 * Final Clean Dry Run (Your Version Polished)
 * left = 0, right = 0
 * c = p
 * set = {p}
 * maxLength = 1
 *
 * left = 0, right = 1
 * c = w
 * set = {p, w}
 * maxLength = 2
 *
 * left = 0, right = 2
 * c = w
 * remove p → set = {w}, left = 1
 * remove w → set = {}, left = 2
 * set = {w}
 * maxLength = 2
 *
 * left = 2, right = 3
 * c = k
 * set = {w, k}
 * maxLength = 2
 *
 * left = 2, right = 4
 * c = e
 * set = {w, k, e}
 * maxLength = 3
 *
 * left = 2, right = 5
 * c = w
 * remove w → set = {k, e}, left = 3
 * set = {k, e, w}
 * maxLength = 3
 */