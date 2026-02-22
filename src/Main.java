import java.util.List;
import java.util.ArrayList;

public class Main{
    public static List<Integer> getRow(int rowIndex){
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for(int i=1;i<rowIndex;i++){
            for(int j=i-1;j>0;j--){
                row.set(j,row.get(j-1)+row.get(j));
            }
            row.add(1);
        }
        return  row;
    }
    public static void main(String args[]){
        int rowIndex = 3;
        System.out.println(getRow(rowIndex));
    }
}