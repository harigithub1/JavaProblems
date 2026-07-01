package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._06_Medium_LC049_GroupAnagrams;

import java.util.*;

public class _Rank1_OmxnOmxn_FreqCount {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<List<String>>(res.values());
    }

    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(input);
        for (List<String> group : result) {
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