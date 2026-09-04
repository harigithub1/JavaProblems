package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._39_Medium_LC424_LongestRepeatingCharacterReplacement;

import java.util.HashSet;
import java.util.Set;

public class OmxnOm_SlidingWindow {
    public static int characterReplacement(String s, int k) {
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
                // below while loop is to shrink the window
                // "(currentIndex - l + 1) - count" means (window size) - number of A's
                // "(currentIndex - l + 1) - count" means (window size) - number of A's in next for each iteration
                //(currentIndex - l + 1) - count > k : The number of characters I need to replace to turn this entire window into c is greater than the number of replacements I'm allowed (k)
                while ((currentIndex - l + 1) - count > k) {
                    if (s.charAt(l) == c) {
                        count--;
                    }
                    l++;
                }
                length = Math.max(length, currentIndex - l + 1);
            }
        }
        return length;
    }

    public static void main (String[] args){
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement(s,k));
    }
}