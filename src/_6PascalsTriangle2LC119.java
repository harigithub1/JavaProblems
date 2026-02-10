import java.util.*;

class _6PascalsTriangle2LC119 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();

        // First element is always 1
        row.add(1);

        // Build each row up to rowIndex
        for (int i = 1; i <= rowIndex; i++) {

            // Add 1 at the end
            row.add(1);

            // Update from right to left
            for (int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }

        return row;
    }

    public static void main(String args[]){
        System.out.println(getRow(4));
    }
}

/**
 * This solution uses:
 *
 * In-Place Dynamic Programming with Rolling Array and Reverse Update
 */