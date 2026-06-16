package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._15_Medium_LC304_RangeSumQuery2DImmutable;

public class NumMatrix2D {

    private int[][] prefixSum2D;

    public NumMatrix2D(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        prefixSum2D = new int[rows + 1][cols + 1];

        for (int i = 0; i < rows; i++) {
            int prefix = 0;
            for (int j = 0; j < cols; j++) {
                prefix = prefix + matrix[i][j];
                int above = prefixSum2D[i][j + 1];
                prefixSum2D[i + 1][j + 1] = prefix + above;
            }
        }
    }

    public int sumRegion(int r1, int c1, int r2, int c2) {
        r1++; c1++; r2++; c2++;
        int r2c2 = prefixSum2D[r2][c2];
        int r2c1_1 = prefixSum2D[r2][c1 - 1];
        int r1_1c2 = prefixSum2D[r1 - 1][c2];
        int r1_1c1_1 = prefixSum2D[r1 - 1][c1 - 1];
        return r2c2 - r1_1c2 - r2c1_1 + r1_1c1_1;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };
        NumMatrix2D numMatrix2D = new NumMatrix2D(matrix);
//        System.out.println(numMatrix2D.sumRegion(2, 1, 4, 3));
//        System.out.println(numMatrix2D.sumRegion(1, 0, 3, 2));
//        System.out.println(numMatrix2D.sumRegion(1, 1, 1, 3));
//        System.out.println(numMatrix2D.sumRegion(2, 3, 2, 3));
//        System.out.println(numMatrix2D.sumRegion(0, 0, 4, 4));
//        System.out.println(numMatrix2D.sumRegion(1, 1, 2, 2));
        System.out.println(numMatrix2D.sumRegion(1, 2, 2, 4));
    }
}