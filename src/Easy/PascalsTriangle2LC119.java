package Easy;

import java.util.*;

class PascalsTriangle2LC119 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();   
        
        for (int i = 0; i <= rowIndex; i++) {

            // Add 1 at the end
            row.add(1);

            // Update from right to left between two 1's
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