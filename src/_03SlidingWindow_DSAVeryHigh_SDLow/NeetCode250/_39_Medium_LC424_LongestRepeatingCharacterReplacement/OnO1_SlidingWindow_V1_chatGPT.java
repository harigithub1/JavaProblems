package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._39_Medium_LC424_LongestRepeatingCharacterReplacement;

public class OnO1_SlidingWindow_V1_chatGPT {
    public static int characterReplacement(String s, int k) {
        int l = 0;
        int[] freq = new int[26];
        int maxFreq = 0;
        int maxLength = 0;
        for (int r = 0; r < s.length(); r++) {
            int index = s.charAt(r) - 'A';
            freq[index]++;
            maxFreq = Math.max(maxFreq, freq[index]);
            // If window needs more than k replacements
            if (r - l + 1 - maxFreq > k) {
                int leftIndex = s.charAt(l) - 'A';
                // Remove l character
                freq[leftIndex]--;
                // Move l
                l++;
                // Recalculate maxFreq
                maxFreq = 0;
                for (int i = 0; i < 26; i++) {
                    maxFreq = Math.max(maxFreq, freq[i]);
                }
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