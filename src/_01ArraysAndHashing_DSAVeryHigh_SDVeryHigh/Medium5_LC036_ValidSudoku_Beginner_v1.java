package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh;

import java.util.*;

public class Medium5_LC036_ValidSudoku_Beginner_v1 {
    public static boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') continue;

                char val = board[r][c];
                String squareKey = (r / 3) + "," + (c / 3);

                // 🔹 ROW
                if (!rows.containsKey(r)) {
                    rows.put(r, new HashSet<>());
                }
                if (rows.get(r).contains(val)) {
                    return false;
                }

                // 🔹 COLUMN
                if (!cols.containsKey(c)) {
                    cols.put(c, new HashSet<>());
                }
                if (cols.get(c).contains(val)) {
                    return false;
                }

                // 🔹 SQUARE
                if (!squares.containsKey(squareKey)) {
                    squares.put(squareKey, new HashSet<>());
                }
                if (squares.get(squareKey).contains(val)) {
                    return false;
                }

                // 🔹 ADD AFTER CHECKS
                rows.get(r).add(val);
                cols.get(c).add(val);
                squares.get(squareKey).add(val);
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