package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._12_Medium_LC881_BoatsToSavePeople;

import java.util.Arrays;

public class OnlognOn_TwoPointers_OppositeDirectionPointers_Greedy {
    public static int minimumNumberOfBoatsRequired(int[] people, int limit) {
        Arrays.sort(people);
        int l = 0;
        int r = people.length - 1;
        int boats = 0;
        while (l <= r) {
            if (people[l] + people[r] <= limit) {
                l++;
            }
            boats++;
            r--;
        }
        return boats;
    }

    public static void main(String[] args) {
        int[] people = {3, 2, 2, 1};
        int limit = 3;
        System.out.println(minimumNumberOfBoatsRequired(people, limit));
    }
}