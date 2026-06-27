package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._17_Medium_LC036_ValidSudoku;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class O81O1_HashSet_OnePass {
    public static boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                rows.putIfAbsent(i,new HashSet<>());
                if (!rows.get(i).add(board[i][j])) {
                    return false;
                }
                cols.putIfAbsent(j, new HashSet<>());
                if(!cols.get(j).add(board[i][j])) {
                    return false;
                }
                String squareKey = (i / 3) + "," + (j / 3);
                squares.putIfAbsent(squareKey, new HashSet<>());
                if(!squares.get(squareKey).add(board[i][j])) {
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
        System.out.println(result);
    }
}