package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._03_Medium_LC6_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

public class OnOm_SlidingWindow {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int l = 0;
        int length = 0;
        for (int r = 0; r < s.length(); r++) {
            while (charSet.contains(s.charAt(r))) {
                charSet.remove(s.charAt(l));
                l++;
            }
            charSet.add(s.charAt(r));
            length = Math.max(length, r - l + 1);
        }
        return length;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}