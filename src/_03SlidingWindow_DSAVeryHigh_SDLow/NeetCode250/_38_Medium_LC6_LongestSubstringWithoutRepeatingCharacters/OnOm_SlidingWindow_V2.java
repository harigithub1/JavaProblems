package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._38_Medium_LC6_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

public class OnOm_SlidingWindow_V2 {
    public static int lengthOfLongestSubstring(String s){
        Set<Character> set = new HashSet<>();
        int l =0;
        int length =0;
        int r=1;
        set.add(s.charAt(l));
        while(r<=s.length()-1){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            r++;
            length = Math.max(length,r-l);
        }
        return length;
    }
    public static void main(String[] args){
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}