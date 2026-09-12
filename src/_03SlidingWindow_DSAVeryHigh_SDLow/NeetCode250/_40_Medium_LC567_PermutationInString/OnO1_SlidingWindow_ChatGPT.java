package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._40_Medium_LC567_PermutationInString;

public class OnO1_SlidingWindow_ChatGPT {
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] freq = new int[26];
        for (char c : s1.toCharArray()) {
            freq[c - 'a']++;
        }
        int required = s1.length();
        for (int right = 0; right < s2.length(); right++) {
            int index = s2.charAt(right) - 'a';
            if (freq[index] > 0) {
                required--;
            }
            freq[index]--;
            // Keep window size == s1.length()
            if (right >= s1.length()) {
                int leftIndex = s2.charAt(right - s1.length()) - 'a';
                freq[leftIndex]++;
                if (freq[leftIndex] > 0) {
                    required++;
                }
            }
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