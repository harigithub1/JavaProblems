package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250;

public class _05_Easy_LeetCode014_LongestCommonPrefix {
    /**
     * vertical scan / column-wise traversal pattern.
     * @param strs
     * @return longest common prefix
     */
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
//        String[] strs = {"flower","flow","flight"};
        String[] strs = {"computer", "com", "compact"};   // understand i == s.length()
//        String[] strs = {"sun", "sunlight", "sunrise"};   // understand return strs[0]
        String result = longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);
    }
}
