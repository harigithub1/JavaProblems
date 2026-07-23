package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._12_Medium_LC881_BoatsToSavePeople;

import java.util.Arrays;

public class OnlognOn_TwoPointersOppositeEnds_Greedy {
    public static int boatsToSavePeople(int[] people, int limit) {
        Arrays.sort(people);
        int l = 0;
        int r = people.length - 1;
        int boats = 0;
        while (l <= r) {
            int remainingCapacity = limit - people[r];
            if (remainingCapacity >= people[l]) {
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
        System.out.println(boatsToSavePeople(people, limit));
    }
}