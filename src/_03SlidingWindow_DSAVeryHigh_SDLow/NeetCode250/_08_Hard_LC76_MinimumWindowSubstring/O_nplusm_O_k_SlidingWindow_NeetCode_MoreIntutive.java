package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._08_Hard_LC76_MinimumWindowSubstring;

import java.util.HashMap;
import java.util.Map;

public class O_nplusm_O_k_SlidingWindow_NeetCode_MoreIntutive {
    public static String minWindow(String s, String t) {
        if (t.isEmpty()) return "";
        Map<Character, Integer> countT = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (char c : t.toCharArray()) {
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }
        int have = 0;
        int need = countT.size();
        int[] res = {-1, -1};
        int resLen = Integer.MAX_VALUE;
        int left = 0;
        for (int currIdx = 0; currIdx < s.length(); currIdx++) {
            char c = s.charAt(currIdx);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (countT.containsKey(c) && window.get(c).equals(countT.get(c))) {
                have++;
            }
            while (have == need) {
                //save the current valid window
                if ((currIdx - left + 1) < resLen) {
                    resLen = currIdx - left + 1;
                    res[0] = left;
                    res[1] = currIdx;
                }
                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);
                if (countT.containsKey(leftChar) && window.get(leftChar) < countT.get(leftChar)) {
                    have--;
                }
                left++;
            }
        }
        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }
}