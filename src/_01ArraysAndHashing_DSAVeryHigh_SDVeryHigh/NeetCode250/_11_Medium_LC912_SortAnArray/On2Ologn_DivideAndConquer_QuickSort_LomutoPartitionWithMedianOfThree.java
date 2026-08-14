package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._11_Medium_LC912_SortAnArray;

public class On2Ologn_DivideAndConquer_QuickSort_LomutoPartitionWithMedianOfThree {
/*
m
↓
Median-of-three
↓
pivot selected at m
↓
move pivot from m → r
↓
pivot at r
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

    public static int getPartitionIndex(int[] nums, int l, int r) {

        int m = l + (r - l) / 2;

        // Median-of-three
        if (nums[l] > nums[m]) {
            swap(nums, l, m);
        }

        if (nums[l] > nums[r]) {
            swap(nums, l, r);
        }

        if (nums[m] > nums[r]) {
            swap(nums, m, r);
        }

        // nums[m] is now the median of nums[l], nums[m], nums[r]

        // Move median pivot to the end
        swap(nums, m, r);

        int pivot = nums[r];

        // Normal Lomuto partition
        int i = l;

        for (int j = l; j < r; j++) {

            if (nums[j] <= pivot) {
                swap(nums, i, j);
                i++;
            }
        }

        // Put pivot in final position
        swap(nums, i, r);

        return i;
    }

    public static void quickSort(int[] nums, int l, int r) {

        if (l >= r) {
            return;
        }

        int pIdx = getPartitionIndex(nums, l, r);

        quickSort(nums, l, pIdx - 1);
        quickSort(nums, pIdx + 1, r);
    }
}
