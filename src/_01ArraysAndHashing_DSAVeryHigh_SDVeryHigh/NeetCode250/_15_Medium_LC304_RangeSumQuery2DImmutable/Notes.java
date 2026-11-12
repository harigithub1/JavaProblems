package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._15_Medium_LC304_RangeSumQuery2DImmutable;

public class Notes {
    /**
     * OmnO1_2DPrefixSum
     */
}

//        another method of generating prefixSumMatrix
//        for (int i = 0; i < rows; i++) {
//            int prefix = 0;
//            for (int j = 0; j < cols; j++) {
//                prefix = prefix + matrix[i][j];
//                prefixSum[i + 1][j + 1] = prefix + prefixSum[i][j + 1];
//            }
//        }