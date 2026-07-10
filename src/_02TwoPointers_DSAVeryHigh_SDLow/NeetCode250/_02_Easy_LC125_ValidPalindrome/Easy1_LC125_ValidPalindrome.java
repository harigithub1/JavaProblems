package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._02_Easy_LC125_ValidPalindrome;

public class Easy1_LC125_ValidPalindrome {
    public static boolean isValidPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            // Skip non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            // Compare ignoring case
            if (Character.toLowerCase(s.charAt(left)) !=
                    Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isValidPalindrome(str));
    }
}