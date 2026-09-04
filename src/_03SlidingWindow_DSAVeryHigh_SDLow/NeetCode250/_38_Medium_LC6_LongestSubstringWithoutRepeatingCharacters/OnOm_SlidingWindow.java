package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._38_Medium_LC6_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

public class OnOm_SlidingWindow {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0;
        int length = 0;
        for (int currentIndex = 0; currentIndex <= s.length()-1; currentIndex++) {
            while (set.contains(s.charAt(currentIndex))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(currentIndex));
            length = Math.max(length, currentIndex - l + 1);
        }
        return length;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}