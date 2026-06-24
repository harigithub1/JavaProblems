package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._17_Medium_LC036_ValidSudoku;

import java.util.HashSet;
import java.util.Set;

public class LC036_ValidSudoku_chatgpt {
    public static boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char ch = board[r][c];

                if (ch == '.') {
                    continue;
                }

                if (!set.add(ch + " in row " + r) ||
                        !set.add(ch + " in col " + c) ||
                        !set.add(ch + " in box " + (r / 3) + "-" + (c / 3))) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        boolean result = isValidSudoku(board);
        System.out.println("Is valid Sudoku? " + result);
    }
}