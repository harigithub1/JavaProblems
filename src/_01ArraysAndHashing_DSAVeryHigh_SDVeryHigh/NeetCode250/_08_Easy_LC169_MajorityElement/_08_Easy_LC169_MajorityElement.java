package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._08_Easy_LC169_MajorityElement;

class _08_Easy_LC169_MajorityElement {
    public static int majorityCandidate(int[] nums) {
        int candidate = 0;
        int count = 0;
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
        System.out.println(majorityCandidate(nums));
    }
}

/**
 * ✅ This code uses the Boyer-Moore Majority Vote Algorithm
 * That is the official, correct name of the pattern/technique you're using.
 *
 * If someone asks:
 * "What pattern is this?"
 *
 * You should say:
 * "This is the Boyer-Moore Majority Vote algorithm."
 * That's the answer interviewers expect.
 *
 * If they go one level deeper:
 *
 * 1️⃣ Algorithm Name
 * 👉 Boyer-Moore Majority Vote
 *
 * 2️⃣ Algorithm Type
 * 👉 _02_Greedy Algorithm
 *
 * Because it makes local decisions without backtracking.
 *
 * So you can also say:
 * "It's a greedy voting algorithm using Boyer-Moore."
 */


