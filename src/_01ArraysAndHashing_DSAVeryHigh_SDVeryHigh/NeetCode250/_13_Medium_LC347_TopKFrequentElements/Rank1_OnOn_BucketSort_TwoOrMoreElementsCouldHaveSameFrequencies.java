package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._13_Medium_LC347_TopKFrequentElements;

import java.util.*;

public class Rank1_OnOn_BucketSort_TwoOrMoreElementsCouldHaveSameFrequencies {
    public static int[] kelementsWithTopFrequencies(int[] nums, int k) {
        // STEP 1: Build a frequency map.
        // Key   = Number from the input array.
        // Value = Frequency (number of occurrences) of that number.
        //
        // Example:
        // nums = {1, 2, 1, 2, 1, 2, 3, 1, 3, 2}
        // map  = {1=4, 2=4, 3=2}
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        /*
         * STEP 2: Create the bucket array.
         *
         * Why List<Integer>[] instead of int[]?
         *
         * Because multiple different numbers can have the same frequency.
         *
         * Example:
         * Number 1 -> Frequency 4
         * Number 2 -> Frequency 4
         *
         * Both numbers must be stored in the same bucket.
         * Therefore, each bucket needs a List to hold multiple elements.
         *
         * Why nums.length + 1?
         *
         * Maximum possible frequency of an element is nums.length.
         * We need indexes from 0 to nums.length.
         *
         * Bucket index represents frequency.
         *
         * Example:
         * bucket[2] -> Numbers appearing 2 times.
         * bucket[4] -> Numbers appearing 4 times.
         */
        List<Integer>[] arrBucket = new List[nums.length + 1]; // initialize each bucket list, i will be the frequency, so we need to initialize all buckets from 0 to nums.length

        // STEP 3: Initialize every bucket.
        //
        // Java initializes array elements to null.
        // We must create an ArrayList at every index before adding elements.
        //
        // Otherwise, calling arrBucket[i].add() would cause NullPointerException.
        for (int i = 0; i <= nums.length; i++) {
            arrBucket[i] = new ArrayList<>();
        }

        /*
         * STEP 4: Distribute numbers into their respective buckets.
         *
         * Iterate through the frequency map.
         *
         * e.getKey()   -> Number
         * e.getValue() -> Frequency
         *
         * Use frequency as the bucket index.
         *
         * Example:
         * Number 1, Frequency 4 -> bucket[4].add(1)
         * Number 2, Frequency 4 -> bucket[4].add(2)
         * Number 3, Frequency 2 -> bucket[2].add(3)
         *
         * Result:
         * bucket[4] = [1, 2]
         * bucket[2] = [3]
         */
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            arrBucket[e.getValue()].add(e.getKey());
        }

        // STEP 5: Create the result array.
        //
        // We only need the top k frequent elements.
        // Therefore, result array size is k.
        int[] res = new int[k];
        int j = 0;

        /*
         * STEP 6: Collect elements from highest frequency to lowest.
         *
         * Start from nums.length because that is the maximum possible frequency.
         *
         * Traverse backwards because:
         * Higher bucket index = Higher frequency.
         *
         * Example:
         * bucket[4] = [1, 2]
         * bucket[2] = [3]
         *
         * We encounter bucket[4] before bucket[2].
         *
         * IMPORTANT:
         * A bucket can contain multiple elements because multiple numbers
         * can have the same frequency.
         */
        for (int i = nums.length; i >= 0; i--) {
            for (int n : arrBucket[i]) {
                res[j] = n;
                j++;
                if (j == k) {
                    return res;
                }
            }
        }

        // This return is a fallback for Java's compiler.
        // Under valid LeetCode constraints (1 <= k <= unique elements),
        // the method returns from inside the loop.
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 1, 2, 3, 1, 3, 2};

        // Edge case: All elements are the same.
        // int[] nums = {5, 5, 5, 5, 5, 5};

        int k = 2;
        int[] result = kelementsWithTopFrequencies(nums, k);
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}