package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250;

public class Easy5_LC014_LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        for (int i = 0; i < strs[0].length(); i++) {
            for (String s : strs) {
                if (i == s.length() || s.charAt(i) != strs[0].charAt(i)) {
                    return s.substring(0, i);
                }
            }
        }
        return strs[0];
    }
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String result = longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);
    }
}
/**
 * i=0
 *
 * flower
 * s.charAt(0) f
 * strs[0].charAt(0) f
 *
 * flow
 * s.charAt(0) f
 * strs[0].charAt(0) f
 *
 * flight
 * s.charAt(0) f
 * strs[0].charAt(0) f
 *
 * flower
 * s.charAt(1) l
 * strs[0].charAt(1) l
 *
 * flow
 * s.charAt(1) l
 * strs[0].charAt(1) l
 *
 * flight
 * s.charAt(1) l
 * strs[0].charAt(1) l
 *
 * flower
 * s.charAt(2) o
 * strs[0].charAt(2) o
 *
 * flow
 * s.charAt(2) o
 * strs[0].charAt(2) o
 *
 * flight
 * s.charAt(2) i
 * strs[0].charAt(2) o
 *
 * return s.substring(0,i)
 * return s.substring(0,2)
 */