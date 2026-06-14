package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._15_Medium_LC304_RangeSumQuery2DImmutable;

public class NumMatrix1D {

    private int[][] prefixSum;

    public NumMatrix1D(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        prefixSum = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            prefixSum[i][0] = matrix[i][0];
            for (int j = 1; j < cols; j++) {
                prefixSum[i][j] = prefixSum[i][j - 1] + matrix[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int res = 0;
        for (int i = row1; i <= row2; i++) {
            if (col1 > 0) {
                res = res + prefixSum[i][col2] - prefixSum[i][col1 - 1];
            } else {
                res = res + prefixSum[i][col2];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };
        NumMatrix1D obj = new NumMatrix1D(matrix);
//        System.out.println(obj.sumRegion(2, 1, 4, 3));
//        System.out.println(obj.sumRegion(1, 0, 3, 2));
//        System.out.println(obj.sumRegion(1, 1, 1, 3));
//        System.out.println(obj.sumRegion(2, 3, 2, 3));
//        System.out.println(obj.sumRegion(0, 0, 4, 4));
//        System.out.println(obj.sumRegion(1, 1, 2, 2));
        System.out.println(obj.sumRegion(1, 2, 2, 4));
    }
}
