package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._06_Medium_LC049_GroupAnagrams;

import java.util.*;

public class Rank1_OmxnOmxn_FreqCount_V2 {
    public static List<List<String>> getGroupedAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for(int i =0;i<s.length();i++){
                count[s.charAt(i)-'a']++;
            }
            StringBuilder key = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                key.append('#').append(count[i]);
            }
            String keyString = key.toString();
            map.putIfAbsent(keyString, new ArrayList<>());
            map.get(keyString).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(getGroupedAnagrams(strs));
    }
}

/*
| Approach        | Time           | Space    | Interview Rating |
| --------------- | -------------- | -------- | ---------------- |
| Sorting         | O(M × N log N) | O(M × N) | ⭐⭐⭐⭐⭐      |
| Frequency Count | O(M × N)       | O(M × N) | ⭐⭐⭐⭐⭐⭐    |
 */