package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._03_Easy_LC680_ValidPalindrome2;

public class OnO1_TwoPointers {
    public static boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return isPalindrome(s, l + 1, r) ||
                        isPalindrome(s, l, r - 1);
            }
            l++;
            r--;
        }
        return true;
    }

    private static boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abca";
        System.out.println(validPalindrome(s));
    }
}