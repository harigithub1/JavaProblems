package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._40_Medium_LC567_PermutationInString;

public class OnO1_SlidingWindow_ChatGPT_V2_1 {
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] freq = new int[26];
        int[] windowFreq = new int[26];
        // Frequency of characters in s1
        for (char c : s1.toCharArray()) {
            freq[c - 'a']++;
        }
        int windowSize = s1.length();
        // Build the first window
        for (int i = 0; i < windowSize; i++) {
            windowFreq[s2.charAt(i) - 'a']++;
        }
        // Check first window
        if (isFreqSame(freq, windowFreq)) {
            return true;
        }
        // Slide the window
        for (int r = windowSize; r < s2.length(); r++) {
            // Add new character
            windowFreq[s2.charAt(r) - 'a']++;
            // Remove character leaving the window
            int l = r - windowSize;
            windowFreq[s2.charAt(l) - 'a']--;
            // Check current window
            if (isFreqSame(freq, windowFreq)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isFreqSame(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }
}
