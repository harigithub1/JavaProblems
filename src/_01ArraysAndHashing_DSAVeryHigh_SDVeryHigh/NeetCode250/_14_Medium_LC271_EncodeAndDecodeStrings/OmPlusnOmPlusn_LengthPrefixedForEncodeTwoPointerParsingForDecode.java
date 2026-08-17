package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._14_Medium_LC271_EncodeAndDecodeStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OmPlusnOmPlusn_LengthPrefixedForEncodeTwoPointerParsingForDecode {
    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public static List<String> decode(String s) {
        // input string 5#hello5#world
        List<String> result = new ArrayList<>();
        // using two pointers i, j
        //i points to the start of the length
        int i = 0;
        while (i < s.length()) {
            // j moves forward until it finds '#'
            int j = i;
            //here using s.charAt(j) != '#' instead of str.charAt(i)=='#' so that it works for multi digit string length
            while (s.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(s.substring(i, j));
            result.add(s.substring(j + 1, j + 1 + length));
            // Move i to the beginning of the next encoded string
            // Example :
            // "5#hello5#world"
            //        ^
            //        next i
            i = j + 1 + length;
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("hello", "world");
        String encoded = encode(input);
        System.out.println("Encoded: " + encoded);
        List<String> decoded = decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}
/*
Pattern: Serialization & Deserialization (Length-Prefix Encoding)
Technique: Parsing + Two Pointers
Time: O(n)
Space: O(n) for output.
 */