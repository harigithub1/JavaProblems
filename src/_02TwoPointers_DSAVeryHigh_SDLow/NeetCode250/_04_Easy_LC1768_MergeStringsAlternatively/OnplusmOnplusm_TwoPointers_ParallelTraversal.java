package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._04_Easy_LC1768_MergeStringsAlternatively;

public class OnplusmOnplusm_TwoPointers_ParallelTraversal {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i++));
            }
            if (j < word2.length()) {
                result.append(word2.charAt(j++));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String word1 = "ab", word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));
    }
}
