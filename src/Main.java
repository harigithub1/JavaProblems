import java.util.*;
public class Main{
    public static List<List<Integer>> generatePascalTriangle(int rowNum){
        List<List<Integer>> result = new ArrayList<>();
        if(rowNum==0){
            return result;
        }
        result.add(Arrays.asList(1));
        for(int i =1;i<rowNum;i++){
            List<Integer> prev = result.get(i-1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j=1;j<i;j++){
                curr.add(prev.get(j-1)+prev.get(j));
            }
            curr.add(1);
            result.add(curr);
        }
        return result;
    }
    public static void main(String args[]){
        int rowNum=5;
        System.out.println(generatePascalTriangle(rowNum));
    }
}