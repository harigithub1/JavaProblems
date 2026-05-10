package practice.set;

import java.util.*;

public class MyHashSet {
    private List<Integer> data;
    public MyHashSet(){
        data = new ArrayList<>();
    }
    public void add(int val){
        if(!data.contains(val)){
            data.add(val);
        }
    }
    public void remove(int val){
        data.remove(Integer.valueOf(val));
    }
    public boolean contains(int val){
        return data.contains(val);
    }
}
