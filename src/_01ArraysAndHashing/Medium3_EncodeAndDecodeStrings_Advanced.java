package _01ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Medium3_EncodeAndDecodeStrings_Advanced {
    // Encodes a list of strings to a single string.
    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }
    // Decodes a single string to a list of strings.
    public static List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = i;
            // Find the delimiter '#'
            while (s.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(s.substring(i, j));
            j++; // skip '#'
            String word = s.substring(j, j + length);
            result.add(word);
            i = j + length;
        }
        return result;
    }

    public static void main(String[] args) {
        // Input
        List<String> input = Arrays.asList("leet", "code", "love", "you");
        // Encode
        String encoded = encode(input);
        System.out.println("Encoded: " + encoded);
        // Decode
        List<String> decoded = decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}