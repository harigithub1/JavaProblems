package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._14_Medium_LC271_EncodeAndDecodeStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _14_Medium_LC271_EncodeAndDecodeStrings {
    public static String encode(List<String> list) {
        StringBuilder sbl = new StringBuilder();
        for (String s : list) {
            sbl.append(s.length()).append('#').append(s);
        }
        return sbl.toString();
    }

    public static List<String> decode(String s) {
        // input string 5#hello5#world
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (s.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(s.substring(i, j));
            result.add(s.substring(j + 1, j + 1 + length));
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