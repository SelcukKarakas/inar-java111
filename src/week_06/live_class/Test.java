package week_06.live_class;

public class Test {

        public static void main(String[] args) {
            int[] numbers = {10, 3, 5, 6};
            int result = findDifference(numbers);
            System.out.println("Difference between the largest and smallest values: " + result);
        }

        public static int findDifference(int[] nums) {
            if (nums.length < 1) {

            }

            int min = nums[0];
            int max = nums[0];

            // Iterate through the array to find the minimum and maximum values
            for (int num : nums) {
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }

            // Calculate the difference between the largest and smallest values
            int difference = max - min;
            return difference;
        }


}




