package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._39_Medium_LC424_LongestRepeatingCharacterReplacement;

import java.util.HashSet;
import java.util.Set;

public class OmxnOm_SlidingWindow_V2 {
    public static int lengthAsPerLongestRepeatingCharacterKFreqReplacement(String s, int k) {
        int length = 0;
        Set<Character> set = new HashSet<>();
        //find unique characters
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        //for each unique character
        for (char c : set) {
            int count = 0, l = 0;
            for (int currentIndex = 0; currentIndex < s.length(); currentIndex++) {
                if (s.charAt(currentIndex) == c) {
                    count++;
                }
                int windowSize = currentIndex - l + 1;
                // below while loop is to shrink the window
                // windowSize - count means number of characters
                // that need to be replaced to turn the entire window into c
                while (windowSize - count > k) {
                    if (s.charAt(l) == c) {
                        count--;
                    }
                    l++;
                    windowSize = currentIndex - l + 1;
                }
                length = Math.max(length, windowSize);
            }
        }
        return length;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(lengthAsPerLongestRepeatingCharacterKFreqReplacement(s, k));
    }
}