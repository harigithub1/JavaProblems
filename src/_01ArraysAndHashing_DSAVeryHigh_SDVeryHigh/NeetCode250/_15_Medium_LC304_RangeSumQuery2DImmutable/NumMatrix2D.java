package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._15_Medium_LC304_RangeSumQuery2DImmutable;

public class NumMatrix2D {

    private int[][] prefixSum;

    public NumMatrix2D(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        prefixSum = new int[rows + 1][cols + 1];

        for (int i = 0; i < rows; i++) {
            int prefix = 0;
            for (int j = 0; j < cols; j++) {
                prefix = prefix + matrix[i][j];
                int above = prefixSum[i][j + 1];
                prefixSum[i + 1][j + 1] = prefix + above;
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return prefixSum[row2 + 1][col2 + 1] - prefixSum[row1][col2 + 1] -
                prefixSum[row2 + 1][col1] + prefixSum[row1][col1];
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