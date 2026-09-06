package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._38_Medium_LC6_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

public class OnOm_SlidingWindow {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0;
        int length = 0;
        for (int right = 0; right <= s.length()-1; right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(right));
            length = Math.max(length, right - l + 1);
        }
        return length;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}