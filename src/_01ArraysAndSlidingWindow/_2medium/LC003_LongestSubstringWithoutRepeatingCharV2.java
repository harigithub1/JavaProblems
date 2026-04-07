package _01ArraysAndSlidingWindow._2medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;

public class LC003_LongestSubstringWithoutRepeatingCharV2 {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
/**
 * Pattern: Sliding Window + HashMap (Last Seen Index Optimization)
 */
