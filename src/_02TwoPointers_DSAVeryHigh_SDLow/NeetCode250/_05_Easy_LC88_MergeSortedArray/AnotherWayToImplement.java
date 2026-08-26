package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._05_Easy_LC88_MergeSortedArray;

public class AnotherWayToImplement {
    public static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        for(int i =nums1.length-1;i>=0;i--){
            if(n<0){
                nums1[i]=nums1[m];
                m--;
            } else if(m<0){
                nums1[i]=nums2[n];
                n--;
            } else if(nums1[m]>nums2[n]){
                nums1[i]=nums1[m];
                m--;
            } else if(nums1[m]<=nums2[n]) {
                nums1[i]=nums2[n];
                n--;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {4,5,6,0,0,0};
        int m = 3;

        int[] nums2 = {1,2,3};
        int n = 3;
        mergeSortedArray(nums1,m,nums2,n);
        for(int num : nums1) {
            System.out.print(num+",");
        }
    }
}