package practice;

import java.util.*;
class Main{
    public static int[] topKFreqEle(int[] nums, int k){
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        List<Integer>[] arr = new List[nums.length+1];
        for(int i=0;i<=nums.length;i++){
            arr[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            arr[e.getValue()].add(e.getKey());
        }
        int[] res = new int[k];
        int j=0;
        outer:
        for(int i=nums.length;i>0;i--){
            for(int n : arr[i]){
                res[j]=n;
                j++;
                if(j==k){
                    break outer;
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums = {1,2,1,2,1,2,3,1,3,2};
        int k = 2;
        System.out.println(Arrays.toString(topKFreqEle(nums,k)));
    }
}