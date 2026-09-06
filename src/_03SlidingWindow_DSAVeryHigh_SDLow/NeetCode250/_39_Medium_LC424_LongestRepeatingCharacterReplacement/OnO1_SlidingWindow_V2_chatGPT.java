package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._39_Medium_LC424_LongestRepeatingCharacterReplacement;

public class OnO1_SlidingWindow_V2_chatGPT {
    public static int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int l = 0;
        int maxFreq = 0;
        int maxLength = 0;
        for (int r = 0; r < s.length(); r++) {
            int index = s.charAt(r) - 'A';
            freq[index]++;
            maxFreq = Math.max(maxFreq, freq[index]);
            // Characters that must be replaced
            int replacements = (r - l + 1) - maxFreq;
            if (replacements > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            maxLength = Math.max(maxLength, r - l + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement(s, k));
    }
}