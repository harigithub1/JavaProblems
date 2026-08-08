package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._03_Easy_LC680_ValidPalindrome2;

public class OnO1_TwoPointers_OppositeDirectionPointers {
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

    public static boolean validPalindrome2(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return isPalindrome(s, l + 1, r) || isPalindrome(s, l, r - 1);
            }
            l++;
            r--;
        }
        //below return is if String is already a palindrome example: racecar. The loop finishes without entering the if.
        return true;
    }

    public static void main(String[] args) {
        String s = "ebcbbe";
        //String s = "deeee"; //here isPalindrome(s, l + 1, r) will become false
        //String s = "aba";
        //String s = "abc";
        System.out.println(validPalindrome2(s));
    }
}