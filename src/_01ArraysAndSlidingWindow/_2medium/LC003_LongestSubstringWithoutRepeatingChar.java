package _01ArraysAndSlidingWindow._2medium;

import java.util.HashSet;
import java.util.Set;

public class LC003_LongestSubstringWithoutRepeatingChar {
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
 * Pattern: Sliding Window (Two Pointers) Pattern
 * remove characters one by one from left untill c is removed (set.remove(s.charAt(left));)
 * i.e slide the window’s left side forward until the duplicate is gone.
 */