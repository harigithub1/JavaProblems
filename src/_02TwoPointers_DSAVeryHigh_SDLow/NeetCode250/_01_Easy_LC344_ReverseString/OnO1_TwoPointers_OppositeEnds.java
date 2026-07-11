package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._01_Easy_LC344_ReverseString;

import java.util.*;

public class OnO1_TwoPointers_OppositeEnds {
    public static void reverseString(char[] chars) {
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        reverseString(chars);
        System.out.println(Arrays.toString(chars));
    }
}
