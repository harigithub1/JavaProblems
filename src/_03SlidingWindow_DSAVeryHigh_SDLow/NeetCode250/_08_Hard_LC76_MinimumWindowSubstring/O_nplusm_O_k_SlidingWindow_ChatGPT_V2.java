package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._08_Hard_LC76_MinimumWindowSubstring;

public class O_nplusm_O_k_SlidingWindow_ChatGPT_V2 {
    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        int[] tFreq = new int[128];
        int[] winFreq = new int[128];
        // Frequency of characters required
        for (char c : t.toCharArray()) {
            tFreq[c]++;
        }
        int required = 0;
        // Number of distinct characters required
        for (int count : tFreq) {
            if (count > 0) {
                required++;
            }
        }

        //sliding window variables
        int formed = 0; //Number of distinct characters whose required frequency has been satisfied.
        int left = 0; //Left boundary of the sliding window.
        int minLeft = 0; //Starting position of the best/minimum window found so far.
        int minLength = Integer.MAX_VALUE; //Length of the best window found so far.

        //expand the window
        for (int currIdx = 0; currIdx < s.length(); currIdx++) {
            // here c is currChar
            char c = s.charAt(currIdx);
            winFreq[c]++;
            // This character has now satisfied its requirement
            if (tFreq[c] > 0 && winFreq[c] == tFreq[c]) {
                formed++;
            }
            // Current winFreq contains all required characters
            while (formed == required) {
                // Update minimum winFreq
                if (currIdx - left + 1 < minLength) {
                    minLength = currIdx - left + 1;
                    minLeft = left;
                }
                char leftChar = s.charAt(left);
                winFreq[leftChar]--;
                // Window is no longer satisfying this character
                if (tFreq[leftChar] > 0 &&
                        winFreq[leftChar] < tFreq[leftChar]) {
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