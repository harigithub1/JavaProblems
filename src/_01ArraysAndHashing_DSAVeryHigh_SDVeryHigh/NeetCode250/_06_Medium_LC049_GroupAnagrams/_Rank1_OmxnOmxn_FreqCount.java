package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._06_Medium_LC049_GroupAnagrams;

import java.util.*;

public class _Rank1_OmxnOmxn_FreqCount {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
}

/*
| Approach        | Time           | Space    | Interview Rating |
| --------------- | -------------- | -------- | ---------------- |
| Sorting         | O(N × K log K) | O(N × K) | ⭐⭐⭐⭐⭐            |
| Frequency Count | O(N × K)       | O(N × K) | ⭐⭐⭐⭐⭐⭐           |
 */