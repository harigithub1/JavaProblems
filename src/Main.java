import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static List<List<Integer>> pascalTriangle(int numRows){
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(1));
        for(int i =1;i<numRows;i++){
            List<Integer> prev = triangle.get(i-1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j=i;j<i;j++){
                curr.add(prev.get(j-1)+prev.get(j));
            }
            curr.add(1);
            triangle.add(curr);
        }
        return triangle;
    }
    public static void main(String args[]){
        int numRows = 5;
        System.out.println(pascalTriangle(numRows));
    }
}