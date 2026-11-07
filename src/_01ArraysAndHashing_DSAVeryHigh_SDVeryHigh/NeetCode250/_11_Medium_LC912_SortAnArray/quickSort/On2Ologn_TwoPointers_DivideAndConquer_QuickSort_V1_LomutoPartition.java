package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._11_Medium_LC912_SortAnArray.quickSort;

public class On2Ologn_TwoPointers_DivideAndConquer_QuickSort_V1_LomutoPartition {
    /*
    r
    ↓
    pivot selected at r
    ↓
    Lomuto partition
    ↓
    pivot moved from r → i
    ↓
    return i
     */
    public static void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    public static int getPivotIndex(int[] nums, int l, int r) {
//        Two pointers
//        i	Tracks the position where the next smaller element should be placed.
//        j	Scans the array to find elements smaller than the pivot.
//        Pointer movement:	Slow and Fast Pointers
//        Specific pointer roles:	Boundary Pointer (i) and Scanning Pointer (j)

//          This is not the traditional opposite-direction two-pointer approach (left and right pointers
//        moving towards each other). It is a same-direction two-pointer approach, where one pointer
//        tracks the boundary and the other scans the array.
        int pivot = nums[r];
        int i = l;
        for (int j = l; j < r; j++) {
            if (nums[j] < pivot) {
                swap(nums, i, j);
                i++;
            }
        }
        swap(nums, i, r);
        return i;
    }

    public static void placeSmallerAndLargerNumsAroundPivot(int[] nums, int l, int r) {
        if (l >= r) {
            return;
        }
        int pIdx = getPivotIndex(nums, l, r);
        placeSmallerAndLargerNumsAroundPivot(nums, l, pIdx - 1);
        placeSmallerAndLargerNumsAroundPivot(nums, pIdx + 1, r);
    }

    public static int[] quickSort(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        placeSmallerAndLargerNumsAroundPivot(nums, l, r);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {8, 3, 7, 4, 9, 2, 6, 5};
        int[] res = quickSort(nums);
        for (int n : res) {
            System.out.println(n + ",");
        }
    }
}
