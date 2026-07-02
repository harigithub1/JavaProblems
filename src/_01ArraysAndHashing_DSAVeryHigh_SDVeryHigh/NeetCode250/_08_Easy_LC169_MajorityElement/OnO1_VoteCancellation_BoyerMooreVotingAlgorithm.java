package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._08_Easy_LC169_MajorityElement;

class OnO1_VoteCancellation_BoyerMooreVotingAlgorithm {
    public static int majorityElement(int[] nums) {
        int candidate = 0, count = 0;
        for (int n : nums) {
            if (count == 0) {
                candidate = n;
            }
            if (n == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
//        int[] nums = {1,2,1,3,1};
//        int[] nums = {2,2,1,1,1,2,2,3,3,3,3,3,3,1,2,1,2}; this is invalid input because No element appears more than 17/2 = 8. So your method returns a candidate, but not necessarily an actual majority.
        System.out.println(majorityElement(nums));
    }
}

/**
 * ✅ This code uses the Boyer-Moore Majority Vote Algorithm
 * (Boyer-Moore Majority Vote Algorithm works here because you may assume that the majority element always exists in the array.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.)
 * Algorithm Type:
 * 👉 Greedy Algorithm
 * Because it makes local decisions without backtracking.
 */