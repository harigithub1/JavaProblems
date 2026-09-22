package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._08_Hard_LC76_MinimumWindowSubstring;

import java.util.HashMap;
import java.util.Map;

public class O_nplusm_O_k_SlidingWindow_ChatGPT {
    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        int[] need = new int[128];
        int[] window = new int[128];
        // Frequency of characters required
        for (char c : t.toCharArray()) {
            need[c]++;
        }
        int required = 0;
        // Number of distinct characters required
        for (int count : need) {
            if (count > 0) {
                required++;
            }
        }
        int formed = 0;
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int minLeft = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            window[c]++;
            // This character has now satisfied its requirement
            if (need[c] > 0 && window[c] == need[c]) {
                formed++;
            }
            // Current window contains all required characters
            while (formed == required) {
                // Update minimum window
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minLeft = left;
                }
                char leftChar = s.charAt(left);
                window[leftChar]--;
                // Window is no longer satisfying this character
                if (need[leftChar] > 0 &&
                        window[leftChar] < need[leftChar]) {
                    formed--;
                }
                left++;
            }
        }
        if (minLength == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(minLeft, minLeft + minLength);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }
}