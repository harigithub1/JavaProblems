package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._04_Easy_LC1768_MergeStringsAlternatively;

public class OnplusmOnplusm_TwoPointers_ParallelTraversal {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int l1 = 0, l2 = 0, n1 = word1.length(), n2 = word2.length();
        while (l1 < n1 && l2 < n2) {
            sb.append(word1.charAt(l1));
            sb.append(word2.charAt(l2));
            l1++;
            l2++;
        }
        while (l1 < n1) {
            sb.append(word1.charAt(l1));
            l1++;
        }
        while (l2 < n2) {
            sb.append(word2.charAt(l2));
            l2++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String word1 = "ab", word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));
    }
}