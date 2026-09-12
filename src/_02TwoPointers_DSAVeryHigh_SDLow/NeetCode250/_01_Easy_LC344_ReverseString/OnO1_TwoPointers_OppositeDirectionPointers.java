package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._01_Easy_LC344_ReverseString;

public class OnO1_TwoPointers_OppositeDirectionPointers {
    public static void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        for(char c : s) {
            System.out.print(c);
        }
    }
}
