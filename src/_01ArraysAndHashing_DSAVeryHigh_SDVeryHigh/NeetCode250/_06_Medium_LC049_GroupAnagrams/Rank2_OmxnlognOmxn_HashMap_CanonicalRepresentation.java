package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._06_Medium_LC049_GroupAnagrams;
import java.util.*;

public class Rank2_OmxnlognOmxn_HashMap_CanonicalRepresentation {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            //Create an empty list only if this key doesn't already have one. so using putIfAbsent instead of put
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] input = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> listOfList = groupAnagrams(input);
        for (List<String> group : listOfList) {
            System.out.println(group);
        }
    }
}

/*
| Approach        | Time           | Space    | Interview Rating |
| --------------- | -------------- | -------- | ---------------- |
| Sorting         | O(N × K log K) | O(N × K) | ⭐⭐⭐⭐⭐            |
| Frequency Count | O(N × K)       | O(N × K) | ⭐⭐⭐⭐⭐⭐           |
 */


