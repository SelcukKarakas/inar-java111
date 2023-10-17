package week_07.live_class;

public class Test3 {

        public static void main(String[] args) {
            int[] arr1 = {1, 0, 1, 0, 0, 1, 1};
            int[] arr2 = {3, 3, 2};
            int[] arr3 = {2, 2, 2};
            int[] arr4 = {1};
            int[] arr5 = {1, 2};

            int[] result1 = evenOdd(arr1);
            int[] result2 = evenOdd(arr2);
            int[] result3 = evenOdd(arr3);
            int[] result4 = evenOdd(arr4);
            int[] result5 = evenOdd(arr5);

            printArray(result1);
            printArray(result2);
            printArray(result3);
            printArray(result4);
            printArray(result5);
        }

        public static int[] evenOdd(int[] nums) {
            int[] result = new int[nums.length];
            int evenIndex = 0;
            int oddIndex = nums.length - 1;

            for (int num : nums) {
                if (num % 2 == 0) {

                    result[evenIndex] = num;
                    evenIndex++;
                } else {
                    result[oddIndex] = num;
                    oddIndex--;
                }
            }

            return result;
        }

        public static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

}
