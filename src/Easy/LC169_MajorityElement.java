package Easy;

class LC169_MajorityElement {
    public static int majorityCandidate(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
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
 * 👉 Greedy Algorithm
 *
 * Because it makes local decisions without backtracking.
 *
 * So you can also say:
 * "It's a greedy voting algorithm using Boyer-Moore."
 */