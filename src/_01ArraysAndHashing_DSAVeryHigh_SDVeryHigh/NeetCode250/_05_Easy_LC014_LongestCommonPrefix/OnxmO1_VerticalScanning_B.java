package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._05_Easy_LC014_LongestCommonPrefix;

public class OnxmO1_VerticalScanning_B {

    public static String longestCommonPrefix(String[] strs) {
        //Outer loop Strings
        for (int i = 1; i < strs.length; i++) {
            //Inner loop Characters
            for (int j = 0; j < strs[0].length(); j++) {
                if (j >= strs[i].length() || strs[0].charAt(j) != strs[i].charAt(j)) {
                    return strs[0].substring(0, j);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}