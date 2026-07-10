package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._01_Easy_LC344_ReverseString;
import  java.util.*;
public class OnO1_TwoPointers_OppositeEnds {
    public static void reverseString(char[] chars){
        int i =0,j=chars.length-1;
        while(i<j){
            char temp = chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        reverseString(chars);
        System.out.println(Arrays.toString(chars));
    }
}
