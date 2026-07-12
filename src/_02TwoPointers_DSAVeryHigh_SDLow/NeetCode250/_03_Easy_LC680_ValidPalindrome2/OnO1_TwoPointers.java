package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._03_Easy_LC680_ValidPalindrome2;

public class OnO1_TwoPointers {
    public static boolean validPalindrome2(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        //below return is if String is already a palindrome example: racecar. The loop finishes without entering the if.
        return true;
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "ebcbbe";
//        String s = "aba";
        System.out.println(validPalindrome2(s));
    }
}