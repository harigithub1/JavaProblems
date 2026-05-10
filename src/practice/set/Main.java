package practice.set;

public class Main {
    public static void main(String[] args){
        MyHashSet set = new MyHashSet();
        set.add(1);
        set.add(2);
        System.out.println(set);
        set.remove(1);
        System.out.println(set);
        System.out.println(set.contains(2));
    }
}
