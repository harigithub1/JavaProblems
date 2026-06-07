package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._15B_Medium_LC304_RangeSumQuery2DImmutable;

public class NumMatrix {

    private int[][] prefixSum;

    public NumMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        prefixSum = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            prefixSum[row][0] = matrix[row][0];
            for (int col = 1; col < cols; col++) {
                prefixSum[row][col] = prefixSum[row][col - 1] + matrix[row][col];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int res = 0;
        for (int row = row1; row <= row2; row++) {
            if (col1 > 0) {
                res += prefixSum[row][col2] - prefixSum[row][col1 - 1];
            } else {
                res += prefixSum[row][col2];
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
        NumMatrix obj = new NumMatrix(matrix);
        System.out.println(obj.sumRegion(2, 1, 4, 3)); // 8
        System.out.println(obj.sumRegion(1, 1, 2, 2)); // 11
        System.out.println(obj.sumRegion(1, 2, 2, 4)); // 12
        System.out.println(obj.sumRegion(1, 1, 1, 3));
        System.out.println(obj.sumRegion(1, 1, 3, 3));
        System.out.println(obj.sumRegion(1, 0, 3, 2));
        System.out.println(obj.sumRegion(2, 3, 2, 3));
        System.out.println(obj.sumRegion(0, 0, 4, 4));
    }
}