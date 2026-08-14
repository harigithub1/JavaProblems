package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._11_Medium_LC912_SortAnArray;

public class On2Ologn_DivideAndConquer_QuickSort_LomutoPartition {
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

    public static int getPartitionIndex(int[] nums, int l, int r) {
        int pivot = nums[r];
        int i = l;
        for (int j = l; j < r; j++) {
            if (nums[j] <= pivot) {
                swap(nums, i, j);
                i++;
            }
        }
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

    public static int[] sortArray(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        quickSort(nums, l, r);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {5, 1, 1, 2, 0, 0};
        int[] res = sortArray(nums);
        for (int n : res) {
            System.out.println(n + ",");
        }
    }
}
