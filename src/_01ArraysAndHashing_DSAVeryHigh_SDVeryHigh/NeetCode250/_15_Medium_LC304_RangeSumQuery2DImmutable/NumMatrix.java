package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._15_Medium_LC304_RangeSumQuery2DImmutable;

public class NumMatrix {

    private int[][] prefixSum;
    public NumMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        prefixSum = new int[rows + 1][cols + 1]; //now all 0s will be added as default values in below prefixSum matrix after initialization
        for(int i = 0;i<rows;i++){
            for(int j =0;j<cols;j++){
                prefixSum[i+1][j+1]=prefixSum[i+1][j]+prefixSum[i][j+1]+matrix[i][j]-prefixSum[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++;
        row2++;
        col1++;
        col2++;
        return prefixSum[row2][col2]-prefixSum[row2][col1-1]-prefixSum[row1-1][col2]+prefixSum[row1-1][col1-1];
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };
        NumMatrix numMatrix = new NumMatrix(matrix);
        System.out.println(numMatrix.sumRegion(1, 2, 2, 4));
    }
}