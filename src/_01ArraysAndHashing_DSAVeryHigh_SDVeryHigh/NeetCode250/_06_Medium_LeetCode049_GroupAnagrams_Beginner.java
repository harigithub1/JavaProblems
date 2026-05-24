package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250;
import java.util.*;

public class _06_Medium_LeetCode049_GroupAnagrams_Beginner {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
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

