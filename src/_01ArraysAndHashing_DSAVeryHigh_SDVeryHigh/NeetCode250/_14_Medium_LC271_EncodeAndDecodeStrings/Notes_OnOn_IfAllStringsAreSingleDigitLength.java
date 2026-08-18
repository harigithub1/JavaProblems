package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._14_Medium_LC271_EncodeAndDecodeStrings;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Notes_OnOn_IfAllStringsAreSingleDigitLength {
    public static String encode(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for(String s : list) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }
    public static List<String> decode(String str) {
        List<String> list = new ArrayList();
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)=='#') {
                int length = Integer.parseInt(str.substring(i-1,i));
                list.add(str.substring(i+1,length+i+1));
                i=i+length;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world");
        String encoded = encode(list);
        System.out.println(encoded);
        List<String> decoded = decode(encoded);
        System.out.println(decoded);
    }
}