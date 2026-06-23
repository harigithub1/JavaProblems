package _01ArraysAndHashing_DSAVeryHigh_SDVeryHigh.NeetCode250._16_Medium_LC238_ProductOfArrayExceptSelf;

public class LC238_ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        //creating res array to store prefix product values initially
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        // now res has all the prefix product values

        // suffix values are stored in suffix variable it changes in each iteration and is used to update the res array with the final product values
        // its values changes from 1 to 4 to 12 to 24 for the given input (since we initialized first suffix value to 1)
        //{1, 2, 3, 4} input
        //{1, 1, 2, 6} prefix values
        // 1  4  12 24 suffix values (its not an array)
        // now mulitply suffix with res(i) you  get the solution
        // dont forget to update suffix values after multiplying

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            //below is the main logic where we multiply suffix values with prefix values since res contains prefix product
            res[i] = res[i] * suffix;

            suffix = suffix * nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] res = productExceptSelf(nums);
        for (int v : res) System.out.print(v + " "); // prints: 24 12 8 6
    }
}