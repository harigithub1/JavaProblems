package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._03_Medium_LC6_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

public class OnOm_SlidingWindow {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0;
        int maxLength = 0;
        for (int r = 0; r <= s.length()-1; r++) {
            while (set.contains(s.charAt(r))) {
                //why does set.remove(s.charAt(l)) work? Because you're not removing based on the Set's index. You're using the string's index. The Set simply searches for the value 'a' and removes it.
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            maxLength = Math.max(maxLength, r - l + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}