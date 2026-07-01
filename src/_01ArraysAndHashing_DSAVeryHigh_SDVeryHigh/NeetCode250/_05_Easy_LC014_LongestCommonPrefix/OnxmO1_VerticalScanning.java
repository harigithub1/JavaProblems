package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._05_Easy_LC014_LongestCommonPrefix;
/*
O(n*m),O(1)
Pattern: Vertical Scanning
 */
public class OnxmO1_VerticalScanning {
    public static String longestCommonPrefix(String[] strs) {
        for (int i = 0; i < strs[0].length(); i++) {
            for (String s : strs) {
                if (i == s.length() || s.charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
//        String[] strs = {"computer", "com", "compact"};   // understand i == s.length() condition
//        String[] strs = {"sun", "sunlight", "sunrise"};   // understand return strs[0] and reason for using i < strs[0].length() in the for loop
        String result = longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);
    }
}