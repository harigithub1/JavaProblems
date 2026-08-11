package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._05_Easy_LC014_LongestCommonPrefix;

public class OnxmO1_VerticalScanning_A_NeetCode {

    public static String longestCommonPrefix(String[] strs) {
        //Outer loop Characters
        for (int i = 0; i < strs[0].length(); i++) {
            //Inner loop Strings
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
        System.out.println(longestCommonPrefix(strs));
    }
}