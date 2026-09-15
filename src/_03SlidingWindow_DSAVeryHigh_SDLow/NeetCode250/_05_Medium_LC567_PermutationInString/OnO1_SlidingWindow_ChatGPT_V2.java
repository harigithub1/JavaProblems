package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._05_Medium_LC567_PermutationInString;

public class OnO1_SlidingWindow_ChatGPT_V2 {
    private static boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] s1Count = new int[26];
        int[] windowCount = new int[26];
        // Frequency of characters in s1
        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }
        int windowSize = s1.length();
        // Build the first window
        for (int i = 0; i < windowSize; i++) {
            windowCount[s2.charAt(i) - 'a']++;
        }
        // Check first window
        if (matches(s1Count, windowCount)) {
            return true;
        }
        // Slide the window
        for (int r = windowSize; r < s2.length(); r++) {
            // Add new character
            windowCount[s2.charAt(r) - 'a']++;
            // Remove character leaving the window
            int l = r - windowSize;
            windowCount[s2.charAt(l) - 'a']--;
            // Check current window
            if (matches(s1Count, windowCount)) {
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
