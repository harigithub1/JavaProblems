import java.util.*;

class _5PascalsTriangleLC118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        // Base case
        if (numRows == 0) return triangle;
        // First row
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        // Build remaining rows
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currRow = new ArrayList<>();
            // First element
            currRow.add(1);
            // Middle elements
            for (int j = 1; j < i; j++) {
                currRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            // Last element
            currRow.add(1);
            triangle.add(currRow);
        }
        return triangle;
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