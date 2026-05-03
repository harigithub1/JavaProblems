package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode150;

import java.util.*;

public class Medium5_LC036_ValidSudoku_Beginner_v1 {
    public static boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                // 🔹 ROW
                if (!rows.containsKey(i)) {
                    rows.put(i, new HashSet<>());
                }
                if (rows.get(i).contains(board[i][j])) {
                    return false;
                }
                rows.get(i).add(board[i][j]);
                // 🔹 COLUMN
                if (!cols.containsKey(j)) {
                    cols.put(j, new HashSet<>());
                }
                if (cols.get(j).contains(board[i][j])) {
                    return false;
                }
                cols.get(j).add(board[i][j]);
                // 🔹 SQUARE
                String squareKey = (i / 3) + "," + (j / 3);
                if (!squares.containsKey(squareKey)) {
                    squares.put(squareKey, new HashSet<>());
                }
                if (squares.get(squareKey).contains(board[i][j])) {
                    return false;
                }
                squares.get(squareKey).add(board[i][j]);
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
/**
 * i 0 j 0 add 5 in row[0], col[0], square[0,0]
 * i 0 j 1 add 3 in row[0], col[1], square[0,0]
 * i 0 j 4 add 7 in row[0], col[4], square[0,1]
 * i 1 j 0 add 6 in row[1], col[0], square[0,0]
 * i 1 j 3 add 1 in row[1], col[3], square[0,1]
 * i 1 j 4 add 9 in row[1], col[4], square[0,1]
 * i 1 j 5 add 5 in row[1], col[5], square[0,1]
 * i 2 j 1 add 9 in row[2], col[1], square[0,0]
 * i 2 j 2 add 8 in row[2], col[2], square[0,0]
 * i 2 j 7 add 6 in row[2], col[7], square[0,2]
 * i 3 j 0 add 8 in row[3], col[0], square[1,0]
 * i 3 j 4 add 6 in row[3], col[4], square[1,1]
 * i 3 j 8 add 3 in row[3], col[8], square[1,2]
 * i 4 j 0 add 4 in row[4], col[0], square[1,0]
 * i 4 j 3 add 8 in row[4], col[3], square[1,1]
 * i 4 j 5 add 3 in row[4], col[5], square[1,1]
 * i 4 j 8 add 1 in row[4], col[8], square[1,2]
 * i 5 j 0 add 7 in row[5], col[0], square[1,0]
 * i 5 j 4 add 2 in row[5], col[4], square[1,1]
 * i 5 j 8 add 6 in row[5], col[8], square[1,2]
 * i 6 j 1 add 6 in row[6], col[1], square[2,0]
 * i 6 j 6 add 2 in row[6], col[6], square[2,2]
 * i 6 j 7 add 8 in row[6], col[7], square[2,2]
 * i 7 j 3 add 4 in row[7], col[3], square[2,1]
 * i 7 j 4 add 1 in row[7], col[4], square[2,1]
 * i 7 j 5 add 9 in row[7], col[5], square[2,1]
 * i 7 j 8 add 5 in row[7], col[8], square[2,2]
 * i 8 j 4 add 8 in row[8], col[4], square[2,1]
 * i 8 j 7 add 7 in row[8], col[7], square[2,2]
 * i 8 j 8 add 9 in row[8], col[8], square[2,2]
 */