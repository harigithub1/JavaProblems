package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._04_Medium_LC424_LongestRepeatingCharacterReplacement;

public class OnO1_SlidingWindow_V3_chatGPT {
    public static int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;
        for (int currIdx = 0; currIdx < s.length(); currIdx++) {
            int index = s.charAt(currIdx) - 'A';
            freq[index]++;
            maxFreq = Math.max(maxFreq, freq[index]);
            // currIdx - left + 1 - maxFreq => Characters that must be replaced
            if (currIdx - left + 1 - maxFreq > k) {
                int leftIndex = s.charAt(left) - 'A';
                freq[leftIndex]--;
                left++;
            }
            maxLength = Math.max(maxLength, currIdx - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement(s, k));
    }
}