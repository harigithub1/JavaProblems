package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._15_Medium_LC304_RangeSumQuery2DImmutable;

public class OmnO1_PrefixSum {
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
//        System.out.println(numMatrix.sumRegion(2, 1, 4, 3));
//        System.out.println(numMatrix.sumRegion(1, 0, 3, 2));
//        System.out.println(numMatrix.sumRegion(1, 1, 1, 3));
//        System.out.println(numMatrix.sumRegion(2, 3, 2, 3));
//        System.out.println(numMatrix.sumRegion(0, 0, 4, 4));
//        System.out.println(numMatrix.sumRegion(1, 1, 2, 2));
    }
}
