package practice;

class Main {
    public static void rotate(int nums[], int k) {
        int l = nums.length;
         k=k%l;
        reverse(nums, 0, l);
        for (int n : nums) {
            System.out.print(n);
        }
        System.out.println();

        reverse(nums, 0, k);
        for (int n : nums) {
            System.out.print(n);
        }
        System.out.println();

        reverse(nums, k, l);
    }

    public static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j - 1];
            nums[j - 1] = temp;
            j--;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
        for (int n : nums) {
            System.out.print(n);
        }
    }
}