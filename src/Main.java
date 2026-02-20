import java.util.List;
import java.util.ArrayList;

public class Main{
    public static List<Integer> getRow(int rowIndex){
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for(int i=0;i<rowIndex;i++){
            List<Integer> prev = row;
            for(int j =i;j>0;j--){
                row.set(j,prev.get(j)+prev.get(j-1));
            }
            row.add(1);
        }
        return row;
    }
    public static void main(String args[]){
        int rowIndex = 4;
        System.out.println(getRow(rowIndex));
    }
}