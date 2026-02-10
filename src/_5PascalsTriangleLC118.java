import java.util.*;

class _5PascalsTriangleLC118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        // Base case
        if (numRows == 0) return result;
        // First row
        result.add(Arrays.asList(1));
        // Build remaining rows
        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = result.get(i - 1);
            List<Integer> curr = new ArrayList<>();
            // First element
            curr.add(1);
            // Middle elements
            for (int j = 1; j < i; j++) {
                curr.add(prev.get(j - 1) + prev.get(j));
            }
            // Last element
            curr.add(1);
            result.add(curr);
        }
        return result;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = generate(numRows);
        System.out.println(result);
    }
}
/**
 * this algorithm uses:
 *
 * ✅ Dynamic Programming technique
 * ✅ Each row depends on the previous row
 * ✅ Uses Pascal’s Triangle formula
 *
 * Dynamic Programming is a technique where you:
 *
 * ✅ Break a big problem into smaller subproblems
 * ✅ Solve each subproblem once
 * ✅ Save the result
 * ✅ Reuse it later instead of recomputing
 *
 * In short:
 *
 * Solve → Store → Reuse
 */