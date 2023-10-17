package week_07.live_class;


import java.util.Arrays;

public class Test4 {

    public static void main(String[] args) {
        int[] arr1 = {2, 10, 3, 4, 20, 5};
        int[] result1 = tenRun(arr1);
        System.out.println(Arrays.toString(tenRun(arr1))); // Output: [2, 10, 10, 10, 20, 20]

        int[] arr2 = {10, 1, 20, 2};
        int[] result2 = tenRun(arr2);


        System.out.println(Arrays.toString(tenRun(arr2))); // Output: [10, 10, 20, 20]

        int[] arr3 = {10, 1, 9, 20};
        int[] result3 = tenRun(arr3);
        System.out.println(Arrays.toString(tenRun(arr3))); // Output: [10, 10, 10, 20]
    }


    public static int[] tenRun(int[] nums) {
        int multipleOfTen = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                multipleOfTen = nums[i];
            } else if (multipleOfTen != -1) {
                nums[i] = multipleOfTen;
            }
        }
        return nums;
    }



}
