import java.util.*;
public class Main{
    public static List<Integer> generateRow(int rowIndex){
        List<Integer> row = new ArrayList<>();
        for(int i =0;i<rowIndex;i++){
            row.add(1);
            for(int j=i-1;j>0;j--){
                row.set(j,row.get(j-1)+row.get(j));
            }
        }
        return row;
    }
    public static void main(String args[]){
        System.out.println(generateRow(5));
    }
}