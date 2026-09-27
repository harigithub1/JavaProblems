package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._05_Medium_LC567_PermutationInString;

public class OnO1_FixedSizeSlidingWindow_ChatGPT {
    public static boolean containsPermutation(int[] s1Freq, int[] windowFreq) {
        for (int i = 0; i < s1Freq.length; i++) {
            if (s1Freq[i] != windowFreq[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkInclusion(String s1, String s2) {
        int s1Freq[] = new int[26];
        //window freq
        int winFreq[] = new int[26];
        int left = 0;
        for (char c : s1.toCharArray()) {
            s1Freq[c - 'a']++;
        }
        for (int currIdx = 0; currIdx < s2.length(); currIdx++) {
            winFreq[s2.charAt(currIdx) - 'a']++;
            if (currIdx - left + 1 > s1.length()) {
                winFreq[s2.charAt(left) - 'a']--;
                left++;
            }
            if (containsPermutation(s1Freq, winFreq)) {
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
