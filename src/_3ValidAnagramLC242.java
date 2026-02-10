public class _3ValidAnagramLC242 {
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

// valid anagrm vs anagram
// space special chars and case is ignored in anagram

//anagram/valid anagram vs palindrome 
// order is ignored in anagram/valid anagram but not in palindrome 

//Pattern: Frequency Counting pattern with a fixed-size counting array
//Time complexity — O(n), Space complexity — O(1)

/*
The standard pattern name for this approach is:
✓ Frequency Counting (Hashing) Pattern
More specifically for strings:
✓ Character Frequency Array Pattern
And in many DSA/interview contexts, it’s also called:
✓ Counting / Bucket Counting Pattern
So the best single name to remember is:
→ Frequency Counting Pattern
*/

//here in first for loop a is used because if other char like b ,c etc are used the index of freq may become negative and negative index is not allowed in array

// for better understanding of second for loop
/*
for (int count : freq) {
    if (count == 0) {
    } else {
        return false;
    }
}
*/