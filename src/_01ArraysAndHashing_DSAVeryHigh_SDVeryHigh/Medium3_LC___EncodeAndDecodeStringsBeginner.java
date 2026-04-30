package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Encodes a list of strings to a single string.
public class Medium3_LC___EncodeAndDecodeStringsBeginner {
    public static String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
        StringBuilder res = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();
        for (String str : strs) {
            sizes.add(str.length());
        }
        for (int size : sizes) {
            res.append(size).append(',');
        }
        res.append('#');
        for (String str : strs) {
            res.append(str);
        }
        return res.toString();
    }

    public static List<String> decode(String str) {
        if (str.length() == 0) {
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while (str.charAt(i) != '#') {
            StringBuilder cur = new StringBuilder();
            while (str.charAt(i) != ',') {
                cur.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(cur.toString()));
            i++;
        }
        i++;
        for (int sz : sizes) {
            res.add(str.substring(i, i + sz));
            i += sz;
        }
        return res;
    }

    public static void main(String[] args) {
        // Input
        List<String> input = Arrays.asList("hello", "world");
        // Encode
        String encoded = encode(input);
        System.out.println("Encoded: " + encoded);
        // Decode
        List<String> decoded = decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}