public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide an array of numbers as command-line arguments.");
            return;
        }

        int[] nums = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }

        int result = singleNumber(nums);
        System.out.println("The number that does not repeat is: " + result);
    }

    public static int singleNumber(int[] nums) {
        // Initialize the result to 0.
        int result = 0;

        for (int num : nums) {
            // XOR the current number with the result.
            // This operation cancels out duplicates.
            result ^= num;
        }

        // Return the final result, which is the number that does not repeat.
        return result;
    
    }
}
