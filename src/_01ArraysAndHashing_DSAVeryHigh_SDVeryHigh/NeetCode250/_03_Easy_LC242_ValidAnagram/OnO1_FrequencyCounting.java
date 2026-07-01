package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._03_Easy_LC242_ValidAnagram;

public class OnO1_FrequencyCounting {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26]; // for lowercase letters
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }
}

// valid anagram vs anagram
// space special chars and case is ignored in anagram

// anagram/valid anagram vs palindrome
// order is ignored in anagram/valid anagram but not in palindrome