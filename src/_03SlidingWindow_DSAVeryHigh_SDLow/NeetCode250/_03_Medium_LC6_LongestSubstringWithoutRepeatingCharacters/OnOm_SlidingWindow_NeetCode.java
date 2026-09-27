package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._03_Medium_LC6_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

public class OnOm_SlidingWindow_NeetCode {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        for (int currIdx = 0; currIdx <= s.length()-1; currIdx++) {
            while (set.contains(s.charAt(currIdx))) {
                //why does set.remove(s.charAt(left)) work? Because you're not removing based on the Set's index. You're using the string's index. The Set simply searches for the value 'a' and removes it.
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(currIdx));
            maxLength = Math.max(maxLength, currIdx - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}