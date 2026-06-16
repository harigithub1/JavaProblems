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

    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++; col1++; row2++; col2++;
        int bottomRightInsidePrefixSumSubMatrix = prefixSum2D[row2][col2];
        int abovePrefixSumSubMatrix = prefixSum2D[row1 - 1][col2];
        int leftToPrefixSumSubMatrix = prefixSum2D[row2][col1 - 1];
        int topLeftAbovePrefixSumSubMatrix = prefixSum2D[row1 - 1][col1 - 1];
        return bottomRightInsidePrefixSumSubMatrix - abovePrefixSumSubMatrix - leftToPrefixSumSubMatrix
                + topLeftAbovePrefixSumSubMatrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };
        NumMatrix2D obj = new NumMatrix2D(matrix);
//        System.out.println(obj.sumRegion(2, 1, 4, 3));
//        System.out.println(obj.sumRegion(1, 0, 3, 2));
//        System.out.println(obj.sumRegion(1, 1, 1, 3));
//        System.out.println(obj.sumRegion(2, 3, 2, 3));
//        System.out.println(obj.sumRegion(0, 0, 4, 4));
//        System.out.println(obj.sumRegion(1, 1, 2, 2));
        System.out.println(obj.sumRegion(1, 2, 2, 4));
    }
}