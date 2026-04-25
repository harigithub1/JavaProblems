package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh;

import java.util.*;

public class Medium5_LC036_ValidSudoku_Beginner_v1 {
    public static boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                char val = board[i][j];
                String squareKey = (i / 3) + "," + (j / 3);
                // 🔹 ROW
                if (!rows.containsKey(i)) {
                    rows.put(i, new HashSet<>());
                }
                if (rows.get(i).contains(val)) {
                    return false;
                }
                rows.get(i).add(val);
                // 🔹 COLUMN
                if (!cols.containsKey(j)) {
                    cols.put(j, new HashSet<>());
                }
                if (cols.get(j).contains(val)) {
                    return false;
                }
                cols.get(j).add(val);
                // 🔹 SQUARE
                if (!squares.containsKey(squareKey)) {
                    squares.put(squareKey, new HashSet<>());
                }
                if (squares.get(squareKey).contains(val)) {
                    return false;
                }
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