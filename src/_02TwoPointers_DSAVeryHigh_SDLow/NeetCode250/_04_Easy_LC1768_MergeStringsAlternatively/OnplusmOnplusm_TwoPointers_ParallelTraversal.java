package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._04_Easy_LC1768_MergeStringsAlternatively;

public class OnplusmOnplusm_TwoPointers_ParallelTraversal {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int l1 = 0;
        int l2 = 0;
        int r1 = word1.length()-1;
        int r2 = word2.length()-1;
        while (l1 <= r1 && l2 <= r2) {
            sb.append(word1.charAt(l1));
            sb.append(word2.charAt(l2));
            l1++;
            l2++;
        }
        while (l1 <= r1) {
            sb.append(word1.charAt(l1));
            l1++;
        }
        while (l2 <= r2) {
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