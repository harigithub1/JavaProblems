package _12DynamicProgramming._1easy;

public class LC070_ClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 2) return n;

        int prev1 = 2; // ways to reach step 2
        int prev2 = 1; // ways to reach step 1

        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }

    public static void main(String args[]){
        int n = 4;
        System.out.println(climbStairs(n));
    }
}

/**
 * 👉 Same pattern appears in:
 *
 * House Robber
 *
 * Min Cost Climbing Stairs
 *
 * Decode Ways
 */