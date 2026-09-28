package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._08_Hard_LC76_MinimumWindowSubstring;

import java.util.HashMap;
import java.util.Map;

public class O_nplusm_O_k_SlidingWindow_NeetCode_MoreIntutive {
    public static String minWindowSubString(String s, String t) {
        if (t.isEmpty()) return "";
        Map<Character, Integer> tFreq = new HashMap<>();
        Map<Character, Integer> winFreq = new HashMap<>();
        for (char c : t.toCharArray()) {
            tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
        }
        int need = tFreq.size(); //How many distinct characters do I need to satisfy?
        int have = 0; //How many distinct required characters have I currently satisfied?

        /*
        res stores:
        res[0] → start index
        res[1] → end index
         */
        int[] res = {-1, -1};
        int resLength = Integer.MAX_VALUE; //resLength is the smallest valid window length found so far.

        int left = 0;
        for (int currIdx = 0; currIdx < s.length(); currIdx++) {
            char currChar = s.charAt(currIdx);
            winFreq.put(currChar, winFreq.getOrDefault(currChar, 0) + 1);

            // here winFreq.get(currChar).equals(tFreq.get(currChar)) is used to handle edge case of duplicate characters in t
            if (tFreq.containsKey(currChar) && winFreq.get(currChar).equals(tFreq.get(currChar))) {
                have++;
            }

            //if current window is valid enter while
            while (have == need) {
                //Now we want to make it smaller.

                //save the current valid winFreq
                if ((currIdx - left + 1) < resLength) {
                    resLength = currIdx - left + 1;
                    //Because the final answer is a substring of s, and knowing only its length isn't enough to know which characters to return we are storing left and currIdx to return substring
                    res[0] = left;
                    res[1] = currIdx;
                }

                //Remove the leftmost character
                //shrinking
                char winLeftChar = s.charAt(left);
                winFreq.put(winLeftChar, winFreq.get(winLeftChar) - 1);
                left++;

                //Check if shrinking made the window invalid. if its invalid, have decrements and then have and need will become different and while loop will exit
                if (tFreq.containsKey(winLeftChar) && winFreq.get(winLeftChar) < tFreq.get(winLeftChar)) {
                    have--;
                }
            }
        }
        return resLength == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindowSubString(s, t));
    }
}