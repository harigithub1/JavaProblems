package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._01_Easy_LC344_ReverseString;

import java.util.*;

public class OnO1_TwoPointers_OppositeDirectionPointers {
    public static void reverseString(char[] chars) {
        int l = 0, r = chars.length - 1;
        while (l < r) {
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        reverseString(chars);
        System.out.println(Arrays.toString(chars));
    }
}
