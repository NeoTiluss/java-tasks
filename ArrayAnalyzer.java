import java.util.HashSet;
import java.util.Scanner;

public class ArrayAnalyzer {
    public static int notContains(int[] array) {
        HashSet<Integer> set = new HashSet<>();

        // Add all elements from the array to the HashSet
        for (int num : array) {
            set.add(num);
        }

        // Iterate through positive integers starting from 1
        int min = 1;
        while (set.contains(min)) {
            min++;
        }

        return min;
    }

    public static void main(String[] args) {
        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array elements separated by spaces:");

        // Read and split the user's input into an array of integers
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] arr = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            arr[i] = Integer.parseInt(inputArray[i]);
        }

        // Calculate and print the result
        int result = notContains(arr);
        System.out.println("Minimum integer not contained in the array: " + result);

        // Close the Scanner
        scanner.close();
    }
}
