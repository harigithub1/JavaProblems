package _02TwoPointers_DSAVeryHigh_SDLow.NeetCode250._05_Easy_LC88_MergeSortedArray;

public class OnplusmO1_TwoPointersBackwardMerge_PlusWritePointer_V2 {
    public static void mergeSortedArrays(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        for(int i =nums1.length-1; i>=0; i--) {
            if(n<0){
                nums1[i]=nums1[m];
                m--;
            } else if(m<0){
                nums1[i]=nums2[n];
                n--;
            } else if(nums1[m]>nums2[n]){
                nums1[i]=nums1[m];
                m--;
            } else {
                nums1[i]=nums2[n];
                n--;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {5,0,0,0};
        int m = 1;
        int[] nums2 = {2,3,4};
        int n = 3;
        mergeSortedArrays(nums1,m,nums2,n);
        for(int num : nums1) {
            System.out.print(num+",");
        }
    }
}