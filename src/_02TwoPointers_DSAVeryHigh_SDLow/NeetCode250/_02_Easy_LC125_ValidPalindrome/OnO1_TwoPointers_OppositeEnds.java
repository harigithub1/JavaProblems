package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._02_Easy_LC125_ValidPalindrome;

public class OnO1_TwoPointers_OppositeEnds {
    public static boolean isValidPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            // Skip non-alphanumeric characters
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) !=
                    Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isValidPalindrome(str));
    }
}