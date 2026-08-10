package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._03_Easy_LC242_ValidAnagram;

public class OnO1_FrequencyCounting {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] arr = new int[26]; // for lowercase letters
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for (int n : arr) {
            if (n != 0) {
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

// anagram vs palindrome
// order is ignored in anagram but not in palindrome