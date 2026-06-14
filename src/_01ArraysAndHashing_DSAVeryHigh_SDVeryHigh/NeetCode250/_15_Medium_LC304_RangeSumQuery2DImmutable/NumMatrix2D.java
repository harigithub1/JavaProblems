package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._15_Medium_LC304_RangeSumQuery2DImmutable;

public class NumMatrix2D {

    private int[][] sumMat;

    public NumMatrix2D(int[][] matrix) {
        int ROWS = matrix.length, COLS = matrix[0].length;
        sumMat = new int[ROWS + 1][COLS + 1];

        for (int r = 0; r < ROWS; r++) {
            int prefix = 0;
            for (int c = 0; c < COLS; c++) {
                prefix += matrix[r][c];
                int above = sumMat[r][c + 1];
                sumMat[r + 1][c + 1] = prefix + above;
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++; col1++; row2++; col2++;
        int bottomRight = sumMat[row2][col2];
        int above = sumMat[row1 - 1][col2];
        int left = sumMat[row2][col1 - 1];
        int topLeft = sumMat[row1 - 1][col1 - 1];
        return bottomRight - above - left + topLeft;
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