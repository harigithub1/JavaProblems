package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._40_Medium_LC567_PermutationInString;

public class OnO1_SlidingWindow_ChatGPT {
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] count = new int[26];
        // Frequency of characters in s1
        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }
        int left = 0;
        int right = 0;
        int required = s1.length();
        while (right < s2.length()) {
            char c = s2.charAt(right);
            // If this character is still needed
            if (count[c - 'a'] > 0) {
                required--;
            }
            count[c - 'a']--;
            right++;
            // Window size becomes larger than s1
            if (right - left > s1.length()) {
                char leftChar = s2.charAt(left);
                count[leftChar - 'a']++;
                if (count[leftChar - 'a'] > 0) {
                    required++;
                }
                left++;
            }
            // All required characters are present
            if (required == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }
}